package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_CustomColorModel;
import org.docx4j.dml.CTCustomColor;

public class CT_CustomColorConverter {
  private CT_CustomColorConverter() {
  }

  public static CT_CustomColorModel fromDocx4j(CTCustomColor value) {
    if (value == null) return null;
    return new CT_CustomColorModel(StringConverter.fromDocx4j(value.getName()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTCustomColor toDocx4j(CT_CustomColorModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_CustomColorModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTCustomColor.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTCustomColor.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_CustomColorModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
