package model.drawingml.main;

import model.XMLSchema.stringModel;

public class CT_RegularTextRunModel {
  private final CT_TextCharacterPropertiesModel rPr;

  private final stringModel t;

  public CT_RegularTextRunModel(CT_TextCharacterPropertiesModel rPr, stringModel t) {
    this.rPr = rPr;
    this.t = t;
  }

  public CT_TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public stringModel getT() {
    return this.t;
  }
}
