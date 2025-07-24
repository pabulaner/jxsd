package com.scell.model.drawingml.main;

public class TextLineBreakModel {
  private final TextCharacterPropertiesModel rPr;

  public TextLineBreakModel(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }
}
