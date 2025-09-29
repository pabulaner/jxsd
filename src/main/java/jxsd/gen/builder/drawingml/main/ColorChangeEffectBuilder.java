package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorChangeEffectModel;
import jxsd.gen.model.drawingml.main.ColorModel;

/**
 * This is a generated sequence class.
 */
public class ColorChangeEffectBuilder {
  private boolean useA;

  private ColorModel clrFrom;

  private ColorModel clrTo;

  public ColorChangeEffectBuilder() {
  }

  public ColorChangeEffectBuilder setUseA(boolean useA) {
    this.useA = useA;
    return this;
  }

  public ColorChangeEffectBuilder setClrFrom(ColorModel clrFrom) {
    this.clrFrom = clrFrom;
    return this;
  }

  public ColorChangeEffectBuilder setClrTo(ColorModel clrTo) {
    this.clrTo = clrTo;
    return this;
  }

  public ColorChangeEffectBuilder from(ColorChangeEffectModel value) {
    this.useA = value.getUseA();
    this.clrFrom = value.getClrFrom();
    this.clrTo = value.getClrTo();
    return this;
  }

  public ColorChangeEffectModel build() {
    return new ColorChangeEffectModel(this.useA, this.clrFrom, this.clrTo);
  }
}
