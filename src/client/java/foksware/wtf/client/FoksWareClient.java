package foksware.wtf.client;

import foksware.wtf.client.Events.EventBus;
import foksware.wtf.client.Events.impl.TickEvent;
import foksware.wtf.client.Module.api.Module;          // ← Добавил этот импорт
import foksware.wtf.client.Module.api.ModuleRepo;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class FoksWareClient implements ClientModInitializer {

	public static ModuleRepo moduleRepo;
	public static EventBus eventBus;


	@Override
	public void onInitializeClient() {
		init();
	}

	private void init() {
		// event = new Event();
		// event.init();

		moduleRepo = new ModuleRepo();
		moduleRepo.init();

		// cfg

		// commands

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (client.player == null || client.level == null) return;

			for (Module module : moduleRepo.getModules()) {
				if (module.isToggled()) {
					module.onTick();
				}
			}
		});

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (client.player == null || client.level == null) return;

			TickEvent tickEvent = new TickEvent();
			// потом здесь будет eventBus.post(tickEvent)
		});

		System.out.println("FoksWare успешно загружен!");
	}
}