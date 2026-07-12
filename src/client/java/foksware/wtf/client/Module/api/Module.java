package foksware.wtf.client.Module.api;

public class Module {
    private String name;
    private String desc;
    private ModuleColoumn coloumn;
    private boolean toggled;

    public void onEnable() {}
    public void onDisable() {}
    public void onTick() {}
    public void onRender2D() {}
    public void onRender3D() {}



    public Module() {
        if (this.getClass().isAnnotationPresent(ModuleAnnotation.class)) {
            ModuleAnnotation anno = this.getClass().getAnnotation(ModuleAnnotation.class);
            this.name = anno.name();
            this.desc = anno.desc();
            this.coloumn = anno.type();
        } else {
            System.out.println("Хуйня переделывай");
        }
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

