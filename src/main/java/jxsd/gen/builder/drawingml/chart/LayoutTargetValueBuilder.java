package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutTargetValueModel;

/**
 * This is a generated enum class.
 */
public class LayoutTargetValueBuilder {
  private LayoutTargetValueModel value;

  public LayoutTargetValueBuilder() {
  }

  public LayoutTargetValueBuilder setValue(LayoutTargetValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutTargetValueBuilder from(LayoutTargetValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutTargetValueModel build() {
    return this.value;
  }
}
