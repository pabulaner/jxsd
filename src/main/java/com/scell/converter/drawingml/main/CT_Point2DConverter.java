package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Point2DModel;
import org.docx4j.dml.CTPoint2D;

public class CT_Point2DConverter {
  private CT_Point2DConverter() {
  }

  public static CT_Point2DModel fromDocx4J(CTPoint2D value) {
    if (value == null) return null;
    return new CT_Point2DModel(ST_CoordinateConverter.fromDocx4J(value.getY()), ST_CoordinateConverter.fromDocx4J(value.getX()));
  }

  public static CTPoint2D toDocx4J(CT_Point2DModel value) {
    return null;
  }
}
