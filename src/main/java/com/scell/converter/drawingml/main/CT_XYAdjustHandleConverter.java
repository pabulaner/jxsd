package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_XYAdjustHandleModel;
import org.docx4j.dml.CTXYAdjustHandle;

public class CT_XYAdjustHandleConverter {
  private CT_XYAdjustHandleConverter() {
  }

  public static CT_XYAdjustHandleModel fromDocx4j(CTXYAdjustHandle value) {
    if (value == null) return null;
    return new CT_XYAdjustHandleModel(ST_AdjCoordinateConverter.fromDocx4j(value.getMaxX()), ST_GeomGuideNameConverter.fromDocx4j(value.getGdRefY()), ST_GeomGuideNameConverter.fromDocx4j(value.getGdRefX()), ST_AdjCoordinateConverter.fromDocx4j(value.getMaxY()), ST_AdjCoordinateConverter.fromDocx4j(value.getMinY()), ST_AdjCoordinateConverter.fromDocx4j(value.getMinX()), CT_AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTXYAdjustHandle toDocx4j(CT_XYAdjustHandleModel value) {
    return null;
  }
}
