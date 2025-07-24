package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CustomGeometry2DModel;
import org.docx4j.dml.CTCustomGeometry2D;

public class CustomGeometry2DConverter {
  private CustomGeometry2DConverter() {
  }

  public static CustomGeometry2DModel fromDocx4J(CTCustomGeometry2D value) {
    if (value == null) return null;
    return new CustomGeometry2DModel(GeomGuideListConverter.fromDocx4J(value.getAvLst()), GeomGuideListConverter.fromDocx4J(value.getGdLst()), AdjustHandleListConverter.fromDocx4J(value.getAhLst()), ConnectionSiteListConverter.fromDocx4J(value.getCxnLst()), GeomRectConverter.fromDocx4J(value.getRect()), Path2DListConverter.fromDocx4J(value.getPathLst()));
  }
}
