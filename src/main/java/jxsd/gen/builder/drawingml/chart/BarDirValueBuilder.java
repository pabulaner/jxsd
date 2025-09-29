package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarDirValueModel;

/**
 * This is a generated enum class.
 */
public class BarDirValueBuilder {
  private BarDirValueModel value;

  public BarDirValueBuilder() {
  }

  public BarDirValueBuilder setValue(BarDirValueModel value) {
    this.value = value;
    return this;
  }

  public BarDirValueBuilder from(BarDirValueModel value) {
    this.value = value;
    return this;
  }

  public BarDirValueModel build() {
    return this.value;
  }
}
