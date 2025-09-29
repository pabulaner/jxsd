package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ChartLinesBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class ChartLinesModel {
  private final ShapePropertiesModel spPr;

  public ChartLinesModel(ShapePropertiesModel spPr) {
    this.spPr = spPr;
  }

  public ChartLinesBuilder builder() {
    return new ChartLinesBuilder().from(this);
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
