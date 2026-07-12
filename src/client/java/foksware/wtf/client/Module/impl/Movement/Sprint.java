package foksware.wtf.client.Module.impl.Movement;


import foksware.wtf.client.Events.Event;
import foksware.wtf.client.Events.impl.TickEvent;
import foksware.wtf.client.FoksWareClient;
import foksware.wtf.client.Module.api.Module;
import foksware.wtf.client.Module.api.ModuleAnnotation;

import static foksware.wtf.client.Module.api.ModuleColoumn.Movement;
import static foksware.wtf.client.Utils.Client.IMinecraft.mc;

@ModuleAnnotation(name = "Sprint", desc = "Тест модуль чисто фокс", type = Movement)
public class Sprint extends Module {
    public Sprint() {
        //это затычка ебанная потом фиксану или ии фиксанет я хззз
        //UPD: переписал чуть чуть логику модуля теперь контсруктора нету короче
        //UPD2: айфоны хуйня и майкрософт хуйня ебанная
        //UDP3: клауд хуйня разрешите заход в россии тогда имба
        //UPD4: ммм пиздец я в ауххе 29 градусов я т ут как  вбане сука
        //UPD5: суки не дают в клауд зайти
    }

    @Override
    public void onEnable() {
        FoksWareClient.eventBus.subscribe(TickEvent.class, this::onTickEvent);
    }

    @Override
    public void onDisable() {
        FoksWareClient.eventBus.unsubscribe(TickEvent.class, this::onTickEvent);
    }

    private void onTickEvent(Event event) {
        if (mc.player == null) return;

        if (mc.player.input.forwardImpulse > 0 && !mc.player.horizontalCollision) {
            mc.player.setSprinting(true);
        }
    }
}


