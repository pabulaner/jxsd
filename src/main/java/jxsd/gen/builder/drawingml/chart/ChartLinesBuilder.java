package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class ChartLinesBuilder {
  private ShapePropertiesModel spPr;

  public ChartLinesBuilder() {
  }

  public ChartLinesBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ChartLinesBuilder from(ChartLinesModel value) {
    this.spPr = value.getSpPr();
    return this;
  }

  public ChartLinesModel build() {
    return new ChartLinesModel(this.spPr);
  }
}
