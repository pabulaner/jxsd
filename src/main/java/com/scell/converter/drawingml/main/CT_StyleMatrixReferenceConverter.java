package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_StyleMatrixReferenceModel;
import org.docx4j.dml.CTStyleMatrixReference;

public class CT_StyleMatrixReferenceConverter {
  private CT_StyleMatrixReferenceConverter() {
  }

  public static CT_StyleMatrixReferenceModel fromDocx4j(CTStyleMatrixReference value) {
    if (value == null) return null;
    return new CT_StyleMatrixReferenceModel(ST_StyleMatrixColumnIndexConverter.fromDocx4j(value.getIdx()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTStyleMatrixReference toDocx4j(CT_StyleMatrixReferenceModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_StyleMatrixReferenceModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTStyleMatrixReference.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTStyleMatrixReference.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_StyleMatrixReferenceModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
