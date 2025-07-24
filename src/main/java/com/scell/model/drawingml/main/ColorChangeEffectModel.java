package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class ColorChangeEffectModel {
  private final BooleanModel useA;

  private final ColorModel clrFrom;

  private final ColorModel clrTo;

  public ColorChangeEffectModel(BooleanModel useA, ColorModel clrFrom, ColorModel clrTo) {
    this.useA = useA;
    this.clrFrom = clrFrom;
    this.clrTo = clrTo;
  }

  public BooleanModel getUseA() {
    return this.useA;
  }

  public ColorModel getClrFrom() {
    return this.clrFrom;
  }

  public ColorModel getClrTo() {
    return this.clrTo;
  }
}
