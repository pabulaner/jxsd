package io.github.pabulaner.jxsd.example;

public class PlotAreaModel {

    private final Double width;

    private final Double height;

    protected PlotAreaModel(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }
}
