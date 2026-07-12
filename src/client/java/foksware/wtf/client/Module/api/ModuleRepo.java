package foksware.wtf.client.Module.api;

import foksware.wtf.client.Module.impl.Movement.Sprint;

import java.util.ArrayList;
import java.util.List;


public class ModuleRepo {
    List<Module> modules = new ArrayList<>();

    public void init() {
        modules.add(new Sprint());
    }

    public Module getModuleByName(String name) {
        for (Module module : modules) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    public <T extends Module> T getModule(Class<T> clazz) {
        for (Module module : modules) {
            if (module.getClass().equals(clazz)) {
                return (T) module;
            }
        }
        return null;
    }



    public List<Module> getModules() {
        return modules;
    }
    //здесь тоже вроед ворк
    //бля панчур ну ты даун нахуй ты все в одном файле написал сука я спастить не могу без негатива
    //СУПЕР БОЛЬШАЯ ОБНОВА КОТОРУЮ Я БЛАГОПОЛУЧНО СПАСТИЛ У КВЕН 3.7 ПЛЮС
}
