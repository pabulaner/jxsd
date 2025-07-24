package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.XYAdjustHandleModel;
import org.docx4j.dml.CTXYAdjustHandle;

public class XYAdjustHandleConverter {
  private XYAdjustHandleConverter() {
  }

  public static XYAdjustHandleModel fromDocx4J(CTXYAdjustHandle value) {
    if (value == null) return null;
    return new XYAdjustHandleModel(AdjCoordinateConverter.fromDocx4J(value.getMaxX()), GeomGuideNameConverter.fromDocx4J(value.getGdRefY()), GeomGuideNameConverter.fromDocx4J(value.getGdRefX()), AdjCoordinateConverter.fromDocx4J(value.getMaxY()), AdjCoordinateConverter.fromDocx4J(value.getMinY()), AdjCoordinateConverter.fromDocx4J(value.getMinX()), AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }
}
