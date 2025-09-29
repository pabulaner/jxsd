package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextFontValueBuilder;

/**
 * This is a generated sequence class.
 */
public class TextFontValueModel {
  private final byte charset;

  private final String typeface;

  private final String panose;

  private final byte pitchFamily;

  public TextFontValueModel(byte charset, String typeface, String panose, byte pitchFamily) {
    this.charset = charset;
    this.typeface = typeface;
    this.panose = panose;
    this.pitchFamily = pitchFamily;
  }

  public TextFontValueBuilder builder() {
    return new TextFontValueBuilder().from(this);
  }

  public byte getCharset() {
    return this.charset;
  }

  public String getTypeface() {
    return this.typeface;
  }

  public String getPanose() {
    return this.panose;
  }

  public byte getPitchFamily() {
    return this.pitchFamily;
  }
}
