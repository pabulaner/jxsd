package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextLineBreakBuilder;

/**
 * This is a generated sequence class.
 */
public class TextLineBreakModel {
  private final TextCharacterPropertiesModel rPr;

  public TextLineBreakModel(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
  }

  public TextLineBreakBuilder builder() {
    return new TextLineBreakBuilder().from(this);
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }
}
