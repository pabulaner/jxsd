package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossesValueModel;

/**
 * This is a generated enum class.
 */
public class CrossesValueBuilder {
  private CrossesValueModel value;

  public CrossesValueBuilder() {
  }

  public CrossesValueBuilder setValue(CrossesValueModel value) {
    this.value = value;
    return this;
  }

  public CrossesValueBuilder from(CrossesValueModel value) {
    this.value = value;
    return this;
  }

  public CrossesValueModel build() {
    return this.value;
  }
}
