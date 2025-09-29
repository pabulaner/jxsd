package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickMarkValueModel;

/**
 * This is a generated enum class.
 */
public class TickMarkValueBuilder {
  private TickMarkValueModel value;

  public TickMarkValueBuilder() {
  }

  public TickMarkValueBuilder setValue(TickMarkValueModel value) {
    this.value = value;
    return this;
  }

  public TickMarkValueBuilder from(TickMarkValueModel value) {
    this.value = value;
    return this;
  }

  public TickMarkValueModel build() {
    return this.value;
  }
}
