package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class RegularTextRunModel {
  private final TextCharacterPropertiesModel rPr;

  private final StringModel t;

  public RegularTextRunModel(TextCharacterPropertiesModel rPr, StringModel t) {
    this.rPr = rPr;
    this.t = t;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public StringModel getT() {
    return this.t;
  }
}
