package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import org.docx4j.dml.CTShapeStyle;

public class CT_ShapeStyleConverter {
  private CT_ShapeStyleConverter() {
  }

  public static CT_ShapeStyleModel fromDocx4J(CTShapeStyle value) {
    if (value == null) return null;
    return new CT_ShapeStyleModel(CT_StyleMatrixReferenceConverter.fromDocx4J(value.getLnRef()), CT_StyleMatrixReferenceConverter.fromDocx4J(value.getFillRef()), CT_StyleMatrixReferenceConverter.fromDocx4J(value.getEffectRef()), CT_FontReferenceConverter.fromDocx4J(value.getFontRef()));
  }

  public static CTShapeStyle toDocx4J(CT_ShapeStyleModel value) {
    return null;
  }
}
