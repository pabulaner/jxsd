package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_ColorChangeEffectModel;
import com.scell.model.drawingml.main.CT_ColorModel;

public class CT_ColorChangeEffectBuilder {
  private BooleanModel useA;

  private CT_ColorModel clrFrom;

  private CT_ColorModel clrTo;

  public CT_ColorChangeEffectBuilder() {
  }

  public CT_ColorChangeEffectBuilder setUseA(BooleanModel useA) {
    this.useA = useA;
    return this;
  }

  public CT_ColorChangeEffectBuilder setClrFrom(CT_ColorModel clrFrom) {
    this.clrFrom = clrFrom;
    return this;
  }

  public CT_ColorChangeEffectBuilder setClrTo(CT_ColorModel clrTo) {
    this.clrTo = clrTo;
    return this;
  }

  public CT_ColorChangeEffectModel build() {
    return new CT_ColorChangeEffectModel(this.useA, this.clrFrom, this.clrTo);
  }

  public CT_ColorChangeEffectBuilder from(CT_ColorChangeEffectModel value) {
    this.useA = value.getUseA();
    this.clrFrom = value.getClrFrom();
    this.clrTo = value.getClrTo();
    return this;
  }
}
