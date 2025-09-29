package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrValTypeModel;
import jxsd.gen.model.drawingml.chart.ErrValTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class ErrValTypeBuilder {
  private ErrValTypeValueModel val;

  public ErrValTypeBuilder() {
  }

  public ErrValTypeBuilder setVal(ErrValTypeValueModel val) {
    this.val = val;
    return this;
  }

  public ErrValTypeBuilder from(ErrValTypeModel value) {
    this.val = value.getVal();
    return this;
  }

  public ErrValTypeModel build() {
    return new ErrValTypeModel(this.val);
  }
}
