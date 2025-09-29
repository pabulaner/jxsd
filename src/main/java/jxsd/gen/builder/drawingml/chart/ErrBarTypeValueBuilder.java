package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrBarTypeValueModel;

/**
 * This is a generated enum class.
 */
public class ErrBarTypeValueBuilder {
  private ErrBarTypeValueModel value;

  public ErrBarTypeValueBuilder() {
  }

  public ErrBarTypeValueBuilder setValue(ErrBarTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrBarTypeValueBuilder from(ErrBarTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrBarTypeValueModel build() {
    return this.value;
  }
}
