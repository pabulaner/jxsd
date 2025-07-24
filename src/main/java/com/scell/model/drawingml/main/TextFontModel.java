package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.ByteModel;

public class TextFontModel {
  private final ByteModel charset;

  private final TypefaceModel typeface;

  private final PanoseModel panose;

  private final ByteModel pitchFamily;

  public TextFontModel(ByteModel charset, TypefaceModel typeface, PanoseModel panose,
      ByteModel pitchFamily) {
    this.charset = charset;
    this.typeface = typeface;
    this.panose = panose;
    this.pitchFamily = pitchFamily;
  }

  public ByteModel getCharset() {
    return this.charset;
  }

  public TypefaceModel getTypeface() {
    return this.typeface;
  }

  public PanoseModel getPanose() {
    return this.panose;
  }

  public ByteModel getPitchFamily() {
    return this.pitchFamily;
  }

  public static class TypefaceModel {
    private final String value;

    public TypefaceModel(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }

  public static class PanoseModel {
    private final String value;

    public PanoseModel(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }
}
