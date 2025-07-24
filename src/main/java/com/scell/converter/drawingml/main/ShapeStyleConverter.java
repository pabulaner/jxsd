package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ShapeStyleModel;
import org.docx4j.dml.CTShapeStyle;

public class ShapeStyleConverter {
  private ShapeStyleConverter() {
  }

  public static ShapeStyleModel fromDocx4J(CTShapeStyle value) {
    if (value == null) return null;
    return new ShapeStyleModel(StyleMatrixReferenceConverter.fromDocx4J(value.getLnRef()), StyleMatrixReferenceConverter.fromDocx4J(value.getFillRef()), StyleMatrixReferenceConverter.fromDocx4J(value.getEffectRef()), FontReferenceConverter.fromDocx4J(value.getFontRef()));
  }
}
