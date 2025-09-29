package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrientationModel;
import jxsd.gen.model.drawingml.chart.OrientationValueModel;

/**
 * This is a generated sequence class.
 */
public class OrientationBuilder {
  private OrientationValueModel val;

  public OrientationBuilder() {
  }

  public OrientationBuilder setVal(OrientationValueModel val) {
    this.val = val;
    return this;
  }

  public OrientationBuilder from(OrientationModel value) {
    this.val = value.getVal();
    return this;
  }

  public OrientationModel build() {
    return new OrientationModel(this.val);
  }
}
