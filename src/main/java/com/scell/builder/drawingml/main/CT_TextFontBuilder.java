package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.ByteModel;
import com.scell.model.drawingml.main.CT_TextFontModel;

public class CT_TextFontBuilder {
  private ByteModel charset;

  private CT_TextFontModel.TypefaceModel typeface;

  private CT_TextFontModel.PanoseModel panose;

  private ByteModel pitchFamily;

  public CT_TextFontBuilder() {
  }

  public CT_TextFontBuilder setCharset(ByteModel charset) {
    this.charset = charset;
    return this;
  }

  public CT_TextFontBuilder setTypeface(CT_TextFontModel.TypefaceModel typeface) {
    this.typeface = typeface;
    return this;
  }

  public CT_TextFontBuilder setPanose(CT_TextFontModel.PanoseModel panose) {
    this.panose = panose;
    return this;
  }

  public CT_TextFontBuilder setPitchFamily(ByteModel pitchFamily) {
    this.pitchFamily = pitchFamily;
    return this;
  }

  public CT_TextFontModel build() {
    return new CT_TextFontModel(this.charset, this.typeface, this.panose, this.pitchFamily);
  }

  public CT_TextFontBuilder from(CT_TextFontModel value) {
    this.charset = value.getCharset();
    this.typeface = value.getTypeface();
    this.panose = value.getPanose();
    this.pitchFamily = value.getPitchFamily();
    return this;
  }

  public static class TypefaceBuilder {
    private String value;

    public TypefaceBuilder() {
      this.value = null;
    }

    public TypefaceBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public TypefaceBuilder from(CT_TextFontModel.TypefaceModel value) {
      this.value = value.getValue();
      return this;
    }

    public CT_TextFontModel.TypefaceModel build() {
      return new CT_TextFontModel.TypefaceModel(this.value);
    }
  }

  public static class PanoseBuilder {
    private String value;

    public PanoseBuilder() {
      this.value = null;
    }

    public PanoseBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public PanoseBuilder from(CT_TextFontModel.PanoseModel value) {
      this.value = value.getValue();
      return this;
    }

    public CT_TextFontModel.PanoseModel build() {
      return new CT_TextFontModel.PanoseModel(this.value);
    }
  }
}
