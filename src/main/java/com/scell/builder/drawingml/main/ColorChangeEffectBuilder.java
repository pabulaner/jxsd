package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.ColorChangeEffectModel;
import com.scell.model.drawingml.main.ColorModel;

public class ColorChangeEffectBuilder {
  private BooleanModel useA;

  private ColorModel clrFrom;

  private ColorModel clrTo;

  public ColorChangeEffectBuilder() {
  }

  public ColorChangeEffectBuilder setUseA(BooleanModel useA) {
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

  public ColorChangeEffectModel build() {
    return new ColorChangeEffectModel(this.useA, this.clrFrom, this.clrTo);
  }

  public ColorChangeEffectBuilder from(ColorChangeEffectModel value) {
    this.useA = value.getUseA();
    this.clrFrom = value.getClrFrom();
    this.clrTo = value.getClrTo();
    return this;
  }
}
