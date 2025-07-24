package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.ByteModel;
import com.scell.model.drawingml.main.TextFontModel;

public class TextFontBuilder {
  private ByteModel charset;

  private TextFontModel.TypefaceModel typeface;

  private TextFontModel.PanoseModel panose;

  private ByteModel pitchFamily;

  public TextFontBuilder() {
  }

  public TextFontBuilder setCharset(ByteModel charset) {
    this.charset = charset;
    return this;
  }

  public TextFontBuilder setTypeface(TextFontModel.TypefaceModel typeface) {
    this.typeface = typeface;
    return this;
  }

  public TextFontBuilder setPanose(TextFontModel.PanoseModel panose) {
    this.panose = panose;
    return this;
  }

  public TextFontBuilder setPitchFamily(ByteModel pitchFamily) {
    this.pitchFamily = pitchFamily;
    return this;
  }

  public TextFontModel build() {
    return new TextFontModel(this.charset, this.typeface, this.panose, this.pitchFamily);
  }

  public TextFontBuilder from(TextFontModel value) {
    this.charset = value.getCharset();
    this.typeface = value.getTypeface();
    this.panose = value.getPanose();
    this.pitchFamily = value.getPitchFamily();
    return this;
  }

  public static class TypefaceBuilder {
    private String value;

    public TypefaceBuilder() {
    }

    public TypefaceBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public TypefaceBuilder from(TextFontModel.TypefaceModel value) {
      this.value = value.getValue();
      return this;
    }

    public TextFontModel.TypefaceModel build() {
      return new TextFontModel.TypefaceModel(this.value);
    }
  }

  public static class PanoseBuilder {
    private String value;

    public PanoseBuilder() {
    }

    public PanoseBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public PanoseBuilder from(TextFontModel.PanoseModel value) {
      this.value = value.getValue();
      return this;
    }

    public TextFontModel.PanoseModel build() {
      return new TextFontModel.PanoseModel(this.value);
    }
  }
}
