package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.UpDownBarBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class UpDownBarModel {
  private final ShapePropertiesModel spPr;

  public UpDownBarModel(ShapePropertiesModel spPr) {
    this.spPr = spPr;
  }

  public UpDownBarBuilder builder() {
    return new UpDownBarBuilder().from(this);
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
