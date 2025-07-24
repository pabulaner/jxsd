package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.ByteConverter;
import com.scell.model.drawingml.main.TextFontModel;
import org.docx4j.dml.TextFont;

public class TextFontConverter {
  private TextFontConverter() {
  }

  public static TextFontModel fromDocx4J(TextFont value) {
    if (value == null) return null;
    return new TextFontModel(ByteConverter.fromDocx4J(value.getCharset()), TypefaceConverter.fromDocx4J(value.getTypeface()), PanoseConverter.fromDocx4J(value.getPanose()), ByteConverter.fromDocx4J(value.getPitchFamily()));
  }

  public static class TypefaceConverter {
    private TypefaceConverter() {
    }

    public static TextFontModel.TypefaceModel fromDocx4J(String value) {
      if (value == null) return null;
      return new TextFontModel.TypefaceModel(value);
    }
  }

  public static class PanoseConverter {
    private PanoseConverter() {
    }

    public static TextFontModel.PanoseModel fromDocx4J(String value) {
      if (value == null) return null;
      return new TextFontModel.PanoseModel(value);
    }
  }
}
