package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DMoveToModel;
import org.docx4j.dml.CTPath2DMoveTo;

public class CT_Path2DMoveToConverter {
  private CT_Path2DMoveToConverter() {
  }

  public static CT_Path2DMoveToModel fromDocx4J(CTPath2DMoveTo value) {
    if (value == null) return null;
    return new CT_Path2DMoveToModel(CT_AdjPoint2DConverter.fromDocx4J(value.getPt()));
  }

  public static CTPath2DMoveTo toDocx4J(CT_Path2DMoveToModel value) {
    return null;
  }
}
