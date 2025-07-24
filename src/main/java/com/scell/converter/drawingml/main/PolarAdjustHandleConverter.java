package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PolarAdjustHandleModel;
import org.docx4j.dml.CTPolarAdjustHandle;

public class PolarAdjustHandleConverter {
  private PolarAdjustHandleConverter() {
  }

  public static PolarAdjustHandleModel fromDocx4J(CTPolarAdjustHandle value) {
    if (value == null) return null;
    return new PolarAdjustHandleModel(GeomGuideNameConverter.fromDocx4J(value.getGdRefAng()), GeomGuideNameConverter.fromDocx4J(value.getGdRefR()), AdjAngleConverter.fromDocx4J(value.getMaxAng()), AdjAngleConverter.fromDocx4J(value.getMinAng()), AdjCoordinateConverter.fromDocx4J(value.getMaxR()), AdjCoordinateConverter.fromDocx4J(value.getMinR()), AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }
}
