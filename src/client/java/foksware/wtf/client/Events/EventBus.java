package foksware.wtf.client.Events;


import foksware.wtf.client.Events.Event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventBus {


    private final Map<Class<? extends Event>, List<EventListener>> listeners = new HashMap<>();


    public void subscribe(Class<? extends Event> eventClass, EventListener listener) {
        listeners.computeIfAbsent(eventClass, k -> new CopyOnWriteArrayList<>()).add(listener);
    }


    public void unsubscribe(Class<? extends Event> eventClass, EventListener listener) {
        List<EventListener> list = listeners.get(eventClass);
        if (list != null) {
            list.remove(listener);
        }
    }


    public <T extends Event> T post(T event) {
        List<EventListener> list = listeners.get(event.getClass());
        if (list != null) {
            for (EventListener listener : list) {
                listener.onEvent(event);
                if (event.isCancelled()) break;
            }
        }
        return event;
    }


    public interface EventListener {
        void onEvent(Event event);
    }
}