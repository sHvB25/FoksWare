package foksware.wtf.client.Module.api.impl;

public class SliderSetting extends Setting<Double> {
    private double min;
    private double max;

    public SliderSetting(String name, double defaultValue, double min, double max) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}