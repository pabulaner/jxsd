package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutModeValueModel;

/**
 * This is a generated enum class.
 */
public class LayoutModeValueBuilder {
  private LayoutModeValueModel value;

  public LayoutModeValueBuilder() {
  }

  public LayoutModeValueBuilder setValue(LayoutModeValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutModeValueBuilder from(LayoutModeValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutModeValueModel build() {
    return this.value;
  }
}
