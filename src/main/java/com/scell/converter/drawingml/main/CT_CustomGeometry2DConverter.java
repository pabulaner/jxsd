package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_CustomGeometry2DModel;
import org.docx4j.dml.CTCustomGeometry2D;

public class CT_CustomGeometry2DConverter {
  private CT_CustomGeometry2DConverter() {
  }

  public static CT_CustomGeometry2DModel fromDocx4j(CTCustomGeometry2D value) {
    if (value == null) return null;
    return new CT_CustomGeometry2DModel(CT_GeomGuideListConverter.fromDocx4j(value.getAvLst()), CT_GeomGuideListConverter.fromDocx4j(value.getGdLst()), CT_AdjustHandleListConverter.fromDocx4j(value.getAhLst()), CT_ConnectionSiteListConverter.fromDocx4j(value.getCxnLst()), CT_GeomRectConverter.fromDocx4j(value.getRect()), CT_Path2DListConverter.fromDocx4j(value.getPathLst()));
  }

  public static CTCustomGeometry2D toDocx4j(CT_CustomGeometry2DModel value) {
    return null;
  }
}
