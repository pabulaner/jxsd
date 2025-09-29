package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.UpDownBarModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class UpDownBarBuilder {
  private ShapePropertiesModel spPr;

  public UpDownBarBuilder() {
  }

  public UpDownBarBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public UpDownBarBuilder from(UpDownBarModel value) {
    this.spPr = value.getSpPr();
    return this;
  }

  public UpDownBarModel build() {
    return new UpDownBarModel(this.spPr);
  }
}
