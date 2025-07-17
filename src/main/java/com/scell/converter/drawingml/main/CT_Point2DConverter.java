package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Point2DModel;
import org.docx4j.dml.CTPoint2D;

public class CT_Point2DConverter {
  private CT_Point2DConverter() {
  }

  public static CT_Point2DModel fromDocx4j(CTPoint2D value) {
    if (value == null) return null;
    return new CT_Point2DModel(ST_CoordinateConverter.fromDocx4j(value.getY()), ST_CoordinateConverter.fromDocx4j(value.getX()));
  }

  public static CTPoint2D toDocx4j(CT_Point2DModel value) {
    return null;
  }
}
