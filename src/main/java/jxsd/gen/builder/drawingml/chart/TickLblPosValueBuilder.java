package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickLblPosValueModel;

/**
 * This is a generated enum class.
 */
public class TickLblPosValueBuilder {
  private TickLblPosValueModel value;

  public TickLblPosValueBuilder() {
  }

  public TickLblPosValueBuilder setValue(TickLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public TickLblPosValueBuilder from(TickLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public TickLblPosValueModel build() {
    return this.value;
  }
}
