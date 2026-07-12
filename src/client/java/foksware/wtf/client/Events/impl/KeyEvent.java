package foksware.wtf.client.Events.impl;

import foksware.wtf.client.Events.Event;

public class KeyEvent extends Event {
    public int key;

    public KeyEvent(int key) {
        this.key = key;
    }
}
