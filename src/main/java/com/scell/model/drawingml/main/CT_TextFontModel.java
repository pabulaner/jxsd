package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.ByteModel;
import com.scell.model.XMLSchema.StringModel;

public class CT_TextFontModel {
  private final ByteModel charset;

  private final TypefaceModel typeface;

  private final PanoseModel panose;

  private final ByteModel pitchFamily;

  public CT_TextFontModel(ByteModel charset, TypefaceModel typeface, PanoseModel panose,
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

  public static class TypefaceModel extends StringModel {
    public TypefaceModel(String value) {
      super(value);
    }
  }

  public static class PanoseModel extends StringModel {
    public PanoseModel(String value) {
      super(value);
    }
  }
}
