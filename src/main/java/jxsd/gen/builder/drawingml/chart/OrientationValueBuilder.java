package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrientationValueModel;

/**
 * This is a generated enum class.
 */
public class OrientationValueBuilder {
  private OrientationValueModel value;

  public OrientationValueBuilder() {
  }

  public OrientationValueBuilder setValue(OrientationValueModel value) {
    this.value = value;
    return this;
  }

  public OrientationValueBuilder from(OrientationValueModel value) {
    this.value = value;
    return this;
  }

  public OrientationValueModel build() {
    return this.value;
  }
}
