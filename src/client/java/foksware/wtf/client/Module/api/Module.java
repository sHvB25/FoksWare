package foksware.wtf.client.Module.api;

public class Module {
    private final String name;
    private final String desc;
    private final ModuleColoumn coloumn;
    public boolean toggled;

    public void onEnable() {}
    public void onDisable() {}
    public void onTick() {}
    public void onRender2D() {}
    public void onRender3D() {}
    

    public Module(String name, String desc, ModuleColoumn colounm) {
        this.name = name;
        this.desc = desc;
        this.coloumn = colounm;
        this.toggled = false;
    }

    public void toggle() {
        this.toggled = !this.toggled;
        if (this.toggled) {
            onEnable();
        } else {
            onDisable();
        }
    }

        public String getName() { return name; }
        public String getDesc() { return desc; }
        public ModuleColoumn getColoumn() { return coloumn; }
        public boolean isToggled() { return toggled; }
        public void setToggled(boolean toggled) { this.toggled = toggled; }



}

