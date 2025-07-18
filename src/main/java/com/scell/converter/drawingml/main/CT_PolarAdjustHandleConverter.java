package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PolarAdjustHandleModel;
import org.docx4j.dml.CTPolarAdjustHandle;

public class CT_PolarAdjustHandleConverter {
  private CT_PolarAdjustHandleConverter() {
  }

  public static CT_PolarAdjustHandleModel fromDocx4J(CTPolarAdjustHandle value) {
    if (value == null) return null;
    return new CT_PolarAdjustHandleModel(ST_GeomGuideNameConverter.fromDocx4J(value.getGdRefAng()), ST_GeomGuideNameConverter.fromDocx4J(value.getGdRefR()), ST_AdjAngleConverter.fromDocx4J(value.getMaxAng()), ST_AdjAngleConverter.fromDocx4J(value.getMinAng()), ST_AdjCoordinateConverter.fromDocx4J(value.getMaxR()), ST_AdjCoordinateConverter.fromDocx4J(value.getMinR()), CT_AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }

  public static CTPolarAdjustHandle toDocx4J(CT_PolarAdjustHandleModel value) {
    return null;
  }
}
