package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_XYAdjustHandleModel;
import org.docx4j.dml.CTXYAdjustHandle;

public class CT_XYAdjustHandleConverter {
  private CT_XYAdjustHandleConverter() {
  }

  public static CT_XYAdjustHandleModel fromDocx4J(CTXYAdjustHandle value) {
    if (value == null) return null;
    return new CT_XYAdjustHandleModel(ST_AdjCoordinateConverter.fromDocx4J(value.getMaxX()), ST_GeomGuideNameConverter.fromDocx4J(value.getGdRefY()), ST_GeomGuideNameConverter.fromDocx4J(value.getGdRefX()), ST_AdjCoordinateConverter.fromDocx4J(value.getMaxY()), ST_AdjCoordinateConverter.fromDocx4J(value.getMinY()), ST_AdjCoordinateConverter.fromDocx4J(value.getMinX()), CT_AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }

  public static CTXYAdjustHandle toDocx4J(CT_XYAdjustHandleModel value) {
    return null;
  }
}
