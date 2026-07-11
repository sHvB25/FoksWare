package foksware.wtf.client.Module.api;

import java.lang.Module;
import java.util.ArrayList;
import java.util.List;

public class ModuleRepo {
    private final List<java.lang.Module> modules = new ArrayList();

    public ModuleRepo() {
    }

    public void setup() {

    }

    public void register(java.lang.Module... module) {
        this.modules.addAll(List.of(module));
    }

    public List<Module> modules() {
        return this.modules;
    }
}
