package foksware.wtf.client.Events.impl;

import foksware.wtf.client.Events.Event;
import net.minecraft.world.entity.Entity;



public class AttackEvent extends Event {
    public Entity target;

    public AttackEvent(Entity target) {
        this.target = target;
    }
}
//s
