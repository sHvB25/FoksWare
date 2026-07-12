package foksware.wtf.client.Events;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {


    private final Map<Object, List<Method>> subscribers = new HashMap<>();


    public void register(Object obj) {
        List<Method> methods = new ArrayList<>();


        for (Method method : obj.getClass().getDeclaredMethods()) {

            if (method.isAnnotationPresent(Subscribe.class)) {
                method.setAccessible(true); // Делаем метод доступным (даже если он private)
                methods.add(method);
            }
        }
        subscribers.put(obj, methods);
    }


    public void unregister(Object obj) {
        subscribers.remove(obj);
    }


    public void post(Event event) {
        for (Map.Entry<Object, List<Method>> entry : subscribers.entrySet()) {
            for (Method method : entry.getValue()) {

                if (method.getParameterTypes().length == 1 &&
                        method.getParameterTypes()[0] == event.getClass()) {
                    try {

                        method.invoke(entry.getKey(), event);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
//что то не хочу ныть я хз