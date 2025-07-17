package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_ColorChangeEffectModel {
  private final booleanModel useA;

  private final CT_ColorModel clrFrom;

  private final CT_ColorModel clrTo;

  public CT_ColorChangeEffectModel(booleanModel useA, CT_ColorModel clrFrom, CT_ColorModel clrTo) {
    this.useA = useA;
    this.clrFrom = clrFrom;
    this.clrTo = clrTo;
  }

  public booleanModel getUseA() {
    return this.useA;
  }

  public CT_ColorModel getClrFrom() {
    return this.clrFrom;
  }

  public CT_ColorModel getClrTo() {
    return this.clrTo;
  }
}
