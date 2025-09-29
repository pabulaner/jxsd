package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ScatterStyleValueModel;

/**
 * This is a generated enum class.
 */
public class ScatterStyleValueBuilder {
  private ScatterStyleValueModel value;

  public ScatterStyleValueBuilder() {
  }

  public ScatterStyleValueBuilder setValue(ScatterStyleValueModel value) {
    this.value = value;
    return this;
  }

  public ScatterStyleValueBuilder from(ScatterStyleValueModel value) {
    this.value = value;
    return this;
  }

  public ScatterStyleValueModel build() {
    return this.value;
  }
}
