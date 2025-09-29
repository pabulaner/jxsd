package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TrendlineTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TrendlineTypeValueBuilder {
  private TrendlineTypeValueModel value;

  public TrendlineTypeValueBuilder() {
  }

  public TrendlineTypeValueBuilder setValue(TrendlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TrendlineTypeValueBuilder from(TrendlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TrendlineTypeValueModel build() {
    return this.value;
  }
}
