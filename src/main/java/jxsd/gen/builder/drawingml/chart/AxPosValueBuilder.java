package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxPosValueModel;

/**
 * This is a generated enum class.
 */
public class AxPosValueBuilder {
  private AxPosValueModel value;

  public AxPosValueBuilder() {
  }

  public AxPosValueBuilder setValue(AxPosValueModel value) {
    this.value = value;
    return this;
  }

  public AxPosValueBuilder from(AxPosValueModel value) {
    this.value = value;
    return this;
  }

  public AxPosValueModel build() {
    return this.value;
  }
}
