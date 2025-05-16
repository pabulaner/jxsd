package io.github.pabulaner.jxsd.example;

public class ChartModel {

    private final TypeEnum type;

    private final PlotAreaModel plotArea;

    private final Double scale;

    protected ChartModel(TypeEnum type, PlotAreaModel plotArea, Double scale) {
        this.validate(scale);

        this.type = type;
        this.plotArea = plotArea;
        this.scale = scale;
    }

    private void validate(Double scale) {
        if (scale < 0 || scale > 1) {
            throw new IllegalStateException();
        }
    }

    public TypeEnum getType() {
        return type;
    }

    public PlotAreaModel getPlotArea() {
        return plotArea;
    }

    public Double getScale() {
        return scale;
    }
}
