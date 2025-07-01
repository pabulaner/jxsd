package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTColorChangeEffectModel {
  private final BooleanModel useA;

  private final CTColorModel clrFrom;

  private final CTColorModel clrTo;

  public CTColorChangeEffectModel(BooleanModel useA, CTColorModel clrFrom, CTColorModel clrTo) {
    this.useA = useA;
    this.clrFrom = clrFrom;
    this.clrTo = clrTo;
  }

  public BooleanModel getUseA() {
    return this.useA;
  }

  public CTColorModel getClrFrom() {
    return this.clrFrom;
  }

  public CTColorModel getClrTo() {
    return this.clrTo;
  }
}
