package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LblAlgnValueModel;

/**
 * This is a generated enum class.
 */
public class LblAlgnValueBuilder {
  private LblAlgnValueModel value;

  public LblAlgnValueBuilder() {
  }

  public LblAlgnValueBuilder setValue(LblAlgnValueModel value) {
    this.value = value;
    return this;
  }

  public LblAlgnValueBuilder from(LblAlgnValueModel value) {
    this.value = value;
    return this;
  }

  public LblAlgnValueModel build() {
    return this.value;
  }
}
