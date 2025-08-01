package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class ColorChangeEffectModel {
  private final BooleanValueModel useA;

  private final ColorModel clrFrom;

  private final ColorModel clrTo;

  public ColorChangeEffectModel(BooleanValueModel useA, ColorModel clrFrom, ColorModel clrTo) {
    this.useA = useA;
    this.clrFrom = clrFrom;
    this.clrTo = clrTo;
  }

  public BooleanValueModel getUseA() {
    return this.useA;
  }

  public ColorModel getClrFrom() {
    return this.clrFrom;
  }

  public ColorModel getClrTo() {
    return this.clrTo;
  }
}
