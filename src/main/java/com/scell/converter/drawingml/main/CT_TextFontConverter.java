package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.ByteConverter;
import com.scell.model.drawingml.main.CT_TextFontModel;
import org.docx4j.dml.CTTextFont;

public class CT_TextFontConverter {
  private CT_TextFontConverter() {
  }

  public static CT_TextFontModel fromDocx4j(CTTextFont value) {
    if (value == null) return null;
    return new CT_TextFontModel(ByteConverter.fromDocx4j(value.getCharset()), TypefaceConverter.fromDocx4j(value.getTypeface()), PanoseConverter.fromDocx4j(value.getPanose()), ByteConverter.fromDocx4j(value.getPitchFamily()));
  }

  public static CTTextFont toDocx4j(CT_TextFontModel value) {
    return null;
  }

  public static class TypefaceConverter {
    private TypefaceConverter() {
    }

    public static CT_TextFontModel.TypefaceModel fromDocx4j(String value) {
      if (value == null) return null;
      return new CT_TextFontModel.TypefaceModel(value);
    }

    public static String toDocx4j(CT_TextFontModel.TypefaceModel value) {
      return null;
    }
  }

  public static class PanoseConverter {
    private PanoseConverter() {
    }

    public static CT_TextFontModel.PanoseModel fromDocx4j(String value) {
      if (value == null) return null;
      return new CT_TextFontModel.PanoseModel(value);
    }

    public static String toDocx4j(CT_TextFontModel.PanoseModel value) {
      return null;
    }
  }
}
