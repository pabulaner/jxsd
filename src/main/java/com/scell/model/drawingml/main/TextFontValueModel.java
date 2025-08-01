package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.ByteValueModel;

public class TextFontValueModel {
  private final ByteValueModel charset;

  private final TypefaceValueModel typeface;

  private final PanoseValueModel panose;

  private final ByteValueModel pitchFamily;

  public TextFontValueModel(ByteValueModel charset, TypefaceValueModel typeface,
      PanoseValueModel panose, ByteValueModel pitchFamily) {
    this.charset = charset;
    this.typeface = typeface;
    this.panose = panose;
    this.pitchFamily = pitchFamily;
  }

  public ByteValueModel getCharset() {
    return this.charset;
  }

  public TypefaceValueModel getTypeface() {
    return this.typeface;
  }

  public PanoseValueModel getPanose() {
    return this.panose;
  }

  public ByteValueModel getPitchFamily() {
    return this.pitchFamily;
  }

  public static class TypefaceValueModel {
    private final String value;

    public TypefaceValueModel(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }

  public static class PanoseValueModel {
    private final String value;

    public PanoseValueModel(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }
}
