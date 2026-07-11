package foksware.wtf.client.Module.impl.Movement;


import foksware.wtf.client.Module.api.Module;
import foksware.wtf.client.Module.api.ModuleAnnotation;
import foksware.wtf.client.Module.api.ModuleColoumn;

import static foksware.wtf.client.Utils.Client.IMinecraft.mc;

@ModuleAnnotation(name = "Sprint", desc = "Тест модуль чисто фокс", type = ModuleColoumn.Movement)
public class Sprint extends Module {
    public Sprint(String name, String desc, ModuleColoumn colounm) {
        super(name, desc, colounm);
        //это затычка ебанная потом фиксану или ии фиксанет я хззз
    }

    @Override
    public void onEnable() {
        if (mc.player == null) {
            return;
        }
        if (mc.player.isSprinting() && mc.player.horizontalCollision) {
            mc.player.setSprinting(true);
        }
    }
}
