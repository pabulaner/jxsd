package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;

public class RegularTextRunModel {
  private final TextCharacterPropertiesModel rPr;

  private final StringValueModel t;

  public RegularTextRunModel(TextCharacterPropertiesModel rPr, StringValueModel t) {
    this.rPr = rPr;
    this.t = t;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public StringValueModel getT() {
    return this.t;
  }
}
