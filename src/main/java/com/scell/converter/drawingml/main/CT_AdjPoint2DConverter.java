package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import org.docx4j.dml.CTAdjPoint2D;

public class CT_AdjPoint2DConverter {
  private CT_AdjPoint2DConverter() {
  }

  public static CT_AdjPoint2DModel fromDocx4j(CTAdjPoint2D value) {
    if (value == null) return null;
    return new CT_AdjPoint2DModel(ST_AdjCoordinateConverter.fromDocx4j(value.getY()), ST_AdjCoordinateConverter.fromDocx4j(value.getX()));
  }

  public static CTAdjPoint2D toDocx4j(CT_AdjPoint2DModel value) {
    return null;
  }
}
