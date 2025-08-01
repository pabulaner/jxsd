package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.ByteValueModel;
import com.scell.model.drawingml.main.TextFontValueModel;

public class TextFontValueBuilder {
  private ByteValueModel charset;

  private TextFontValueModel.TypefaceValueModel typeface;

  private TextFontValueModel.PanoseValueModel panose;

  private ByteValueModel pitchFamily;

  public TextFontValueBuilder() {
  }

  public TextFontValueBuilder setCharset(ByteValueModel charset) {
    this.charset = charset;
    return this;
  }

  public TextFontValueBuilder setTypeface(TextFontValueModel.TypefaceValueModel typeface) {
    this.typeface = typeface;
    return this;
  }

  public TextFontValueBuilder setPanose(TextFontValueModel.PanoseValueModel panose) {
    this.panose = panose;
    return this;
  }

  public TextFontValueBuilder setPitchFamily(ByteValueModel pitchFamily) {
    this.pitchFamily = pitchFamily;
    return this;
  }

  public TextFontValueModel build() {
    return new TextFontValueModel(this.charset, this.typeface, this.panose, this.pitchFamily);
  }

  public TextFontValueBuilder from(TextFontValueModel value) {
    this.charset = value.getCharset();
    this.typeface = value.getTypeface();
    this.panose = value.getPanose();
    this.pitchFamily = value.getPitchFamily();
    return this;
  }

  public static class TypefaceValueBuilder {
    private String value;

    public TypefaceValueBuilder() {
    }

    public TypefaceValueBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public TypefaceValueBuilder from(TextFontValueModel.TypefaceValueModel value) {
      this.value = value.getValue();
      return this;
    }

    public TextFontValueModel.TypefaceValueModel build() {
      return new TextFontValueModel.TypefaceValueModel(this.value);
    }
  }

  public static class PanoseValueBuilder {
    private String value;

    public PanoseValueBuilder() {
    }

    public PanoseValueBuilder setValue(String value) {
      this.value = value;
      return this;
    }

    public PanoseValueBuilder from(TextFontValueModel.PanoseValueModel value) {
      this.value = value.getValue();
      return this;
    }

    public TextFontValueModel.PanoseValueModel build() {
      return new TextFontValueModel.PanoseValueModel(this.value);
    }
  }
}
