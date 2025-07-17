package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FontReferenceModel;
import org.docx4j.dml.CTFontReference;

public class CT_FontReferenceConverter {
  private CT_FontReferenceConverter() {
  }

  public static CT_FontReferenceModel fromDocx4j(CTFontReference value) {
    if (value == null) return null;
    return new CT_FontReferenceModel(ST_FontCollectionIndexConverter.fromDocx4j(value.getIdx()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTFontReference toDocx4j(CT_FontReferenceModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_FontReferenceModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTFontReference.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTFontReference.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_FontReferenceModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
