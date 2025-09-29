package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SplitTypeValueModel;

/**
 * This is a generated enum class.
 */
public class SplitTypeValueBuilder {
  private SplitTypeValueModel value;

  public SplitTypeValueBuilder() {
  }

  public SplitTypeValueBuilder setValue(SplitTypeValueModel value) {
    this.value = value;
    return this;
  }

  public SplitTypeValueBuilder from(SplitTypeValueModel value) {
    this.value = value;
    return this;
  }

  public SplitTypeValueModel build() {
    return this.value;
  }
}
