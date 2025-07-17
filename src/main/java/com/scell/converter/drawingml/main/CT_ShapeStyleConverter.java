package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import org.docx4j.dml.CTShapeStyle;

public class CT_ShapeStyleConverter {
  private CT_ShapeStyleConverter() {
  }

  public static CT_ShapeStyleModel fromDocx4j(CTShapeStyle value) {
    if (value == null) return null;
    return new CT_ShapeStyleModel(CT_StyleMatrixReferenceConverter.fromDocx4j(value.getLnRef()), CT_StyleMatrixReferenceConverter.fromDocx4j(value.getFillRef()), CT_StyleMatrixReferenceConverter.fromDocx4j(value.getEffectRef()), CT_FontReferenceConverter.fromDocx4j(value.getFontRef()));
  }

  public static CTShapeStyle toDocx4j(CT_ShapeStyleModel value) {
    return null;
  }
}
