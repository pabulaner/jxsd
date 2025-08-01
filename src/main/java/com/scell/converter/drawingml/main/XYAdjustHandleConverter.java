package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.XYAdjustHandleModel;
import org.docx4j.dml.CTXYAdjustHandle;

public class XYAdjustHandleConverter {
  private XYAdjustHandleConverter() {
  }

  public static XYAdjustHandleModel fromDocx4J(CTXYAdjustHandle value) {
    if (value == null) return null;
    return new XYAdjustHandleModel(AdjCoordinateValueConverter.fromDocx4J(value.getMaxX()), GeomGuideNameValueConverter.fromDocx4J(value.getGdRefY()), GeomGuideNameValueConverter.fromDocx4J(value.getGdRefX()), AdjCoordinateValueConverter.fromDocx4J(value.getMaxY()), AdjCoordinateValueConverter.fromDocx4J(value.getMinY()), AdjCoordinateValueConverter.fromDocx4J(value.getMinX()), AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }
}
