package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DLineToModel;
import org.docx4j.dml.CTPath2DLineTo;

public class CT_Path2DLineToConverter {
  private CT_Path2DLineToConverter() {
  }

  public static CT_Path2DLineToModel fromDocx4J(CTPath2DLineTo value) {
    if (value == null) return null;
    return new CT_Path2DLineToModel(CT_AdjPoint2DConverter.fromDocx4J(value.getPt()));
  }

  public static CTPath2DLineTo toDocx4J(CT_Path2DLineToModel value) {
    return null;
  }
}
