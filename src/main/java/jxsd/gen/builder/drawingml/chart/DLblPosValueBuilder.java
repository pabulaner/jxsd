package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DLblPosValueModel;

/**
 * This is a generated enum class.
 */
public class DLblPosValueBuilder {
  private DLblPosValueModel value;

  public DLblPosValueBuilder() {
  }

  public DLblPosValueBuilder setValue(DLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public DLblPosValueBuilder from(DLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public DLblPosValueModel build() {
    return this.value;
  }
}
