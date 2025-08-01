package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.ByteValueConverter;
import com.scell.model.drawingml.main.TextFontValueModel;
import org.docx4j.dml.TextFont;

public class TextFontValueConverter {
  private TextFontValueConverter() {
  }

  public static TextFontValueModel fromDocx4J(TextFont value) {
    if (value == null) return null;
    return new TextFontValueModel(ByteValueConverter.fromDocx4J(value.getCharset()), TypefaceValueConverter.fromDocx4J(value.getTypeface()), PanoseValueConverter.fromDocx4J(value.getPanose()), ByteValueConverter.fromDocx4J(value.getPitchFamily()));
  }

  public static class TypefaceValueConverter {
    private TypefaceValueConverter() {
    }

    public static TextFontValueModel.TypefaceValueModel fromDocx4J(String value) {
      if (value == null) return null;
      return new TextFontValueModel.TypefaceValueModel(value);
    }
  }

  public static class PanoseValueConverter {
    private PanoseValueConverter() {
    }

    public static TextFontValueModel.PanoseValueModel fromDocx4J(String value) {
      if (value == null) return null;
      return new TextFontValueModel.PanoseValueModel(value);
    }
  }
}
