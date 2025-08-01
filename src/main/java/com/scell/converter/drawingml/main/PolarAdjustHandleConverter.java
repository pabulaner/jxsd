package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PolarAdjustHandleModel;
import org.docx4j.dml.CTPolarAdjustHandle;

public class PolarAdjustHandleConverter {
  private PolarAdjustHandleConverter() {
  }

  public static PolarAdjustHandleModel fromDocx4J(CTPolarAdjustHandle value) {
    if (value == null) return null;
    return new PolarAdjustHandleModel(GeomGuideNameValueConverter.fromDocx4J(value.getGdRefAng()), GeomGuideNameValueConverter.fromDocx4J(value.getGdRefR()), AdjAngleValueConverter.fromDocx4J(value.getMaxAng()), AdjAngleValueConverter.fromDocx4J(value.getMinAng()), AdjCoordinateValueConverter.fromDocx4J(value.getMaxR()), AdjCoordinateValueConverter.fromDocx4J(value.getMinR()), AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }
}
