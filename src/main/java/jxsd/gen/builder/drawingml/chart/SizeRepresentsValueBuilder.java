package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SizeRepresentsValueModel;

/**
 * This is a generated enum class.
 */
public class SizeRepresentsValueBuilder {
  private SizeRepresentsValueModel value;

  public SizeRepresentsValueBuilder() {
  }

  public SizeRepresentsValueBuilder setValue(SizeRepresentsValueModel value) {
    this.value = value;
    return this;
  }

  public SizeRepresentsValueBuilder from(SizeRepresentsValueModel value) {
    this.value = value;
    return this;
  }

  public SizeRepresentsValueModel build() {
    return this.value;
  }
}
