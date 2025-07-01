package test.drawingml.main;

import test.XMLSchema.StringModel;

public class CTRegularTextRunModel {
  private final CTTextCharacterPropertiesModel rPr;

  private final StringModel t;

  public CTRegularTextRunModel(CTTextCharacterPropertiesModel rPr, StringModel t) {
    this.rPr = rPr;
    this.t = t;
  }

  public CTTextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public StringModel getT() {
    return this.t;
  }
}
