package foksware.wtf.client.Utils.Client;

import net.minecraft.network.chat.Component;

import static foksware.wtf.client.Utils.Client.IMinecraft.mc;

public class SayUtil {

    private static String PREFIX = "FoksWare -> ";

    public static void say(String text) {
        if (mc.player != null) {
            mc.player.displayClientMessage(Component.literal(PREFIX + text), false);

        }
    }
}
