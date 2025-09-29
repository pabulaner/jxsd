package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextFontValueModel;

/**
 * This is a generated sequence class.
 */
public class TextFontValueBuilder {
  private byte charset;

  private String typeface;

  private String panose;

  private byte pitchFamily;

  public TextFontValueBuilder() {
  }

  public TextFontValueBuilder setCharset(byte charset) {
    this.charset = charset;
    return this;
  }

  public TextFontValueBuilder setTypeface(String typeface) {
    this.typeface = typeface;
    return this;
  }

  public TextFontValueBuilder setPanose(String panose) {
    this.panose = panose;
    return this;
  }

  public TextFontValueBuilder setPitchFamily(byte pitchFamily) {
    this.pitchFamily = pitchFamily;
    return this;
  }

  public TextFontValueBuilder from(TextFontValueModel value) {
    this.charset = value.getCharset();
    this.typeface = value.getTypeface();
    this.panose = value.getPanose();
    this.pitchFamily = value.getPitchFamily();
    return this;
  }

  public TextFontValueModel build() {
    return new TextFontValueModel(this.charset, this.typeface, this.panose, this.pitchFamily);
  }
}
