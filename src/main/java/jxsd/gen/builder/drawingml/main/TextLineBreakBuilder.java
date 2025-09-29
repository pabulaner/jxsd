package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import jxsd.gen.model.drawingml.main.TextLineBreakModel;

/**
 * This is a generated sequence class.
 */
public class TextLineBreakBuilder {
  private TextCharacterPropertiesModel rPr;

  public TextLineBreakBuilder() {
  }

  public TextLineBreakBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public TextLineBreakBuilder from(TextLineBreakModel value) {
    this.rPr = value.getRPr();
    return this;
  }

  public TextLineBreakModel build() {
    return new TextLineBreakModel(this.rPr);
  }
}
