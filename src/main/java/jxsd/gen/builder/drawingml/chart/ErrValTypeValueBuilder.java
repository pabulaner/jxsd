package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrValTypeValueModel;

/**
 * This is a generated enum class.
 */
public class ErrValTypeValueBuilder {
  private ErrValTypeValueModel value;

  public ErrValTypeValueBuilder() {
  }

  public ErrValTypeValueBuilder setValue(ErrValTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrValTypeValueBuilder from(ErrValTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ErrValTypeValueModel build() {
    return this.value;
  }
}
