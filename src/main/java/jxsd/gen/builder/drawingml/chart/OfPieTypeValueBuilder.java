package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OfPieTypeValueModel;

/**
 * This is a generated enum class.
 */
public class OfPieTypeValueBuilder {
  private OfPieTypeValueModel value;

  public OfPieTypeValueBuilder() {
  }

  public OfPieTypeValueBuilder setValue(OfPieTypeValueModel value) {
    this.value = value;
    return this;
  }

  public OfPieTypeValueBuilder from(OfPieTypeValueModel value) {
    this.value = value;
    return this;
  }

  public OfPieTypeValueModel build() {
    return this.value;
  }
}
