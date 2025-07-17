package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PolarAdjustHandleModel;
import org.docx4j.dml.CTPolarAdjustHandle;

public class CT_PolarAdjustHandleConverter {
  private CT_PolarAdjustHandleConverter() {
  }

  public static CT_PolarAdjustHandleModel fromDocx4j(CTPolarAdjustHandle value) {
    if (value == null) return null;
    return new CT_PolarAdjustHandleModel(ST_GeomGuideNameConverter.fromDocx4j(value.getGdRefAng()), ST_GeomGuideNameConverter.fromDocx4j(value.getGdRefR()), ST_AdjAngleConverter.fromDocx4j(value.getMaxAng()), ST_AdjAngleConverter.fromDocx4j(value.getMinAng()), ST_AdjCoordinateConverter.fromDocx4j(value.getMaxR()), ST_AdjCoordinateConverter.fromDocx4j(value.getMinR()), CT_AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTPolarAdjustHandle toDocx4j(CT_PolarAdjustHandleModel value) {
    return null;
  }
}
