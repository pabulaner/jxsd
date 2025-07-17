package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ConnectionSiteModel;
import org.docx4j.dml.CTConnectionSite;

public class CT_ConnectionSiteConverter {
  private CT_ConnectionSiteConverter() {
  }

  public static CT_ConnectionSiteModel fromDocx4j(CTConnectionSite value) {
    if (value == null) return null;
    return new CT_ConnectionSiteModel(ST_AdjAngleConverter.fromDocx4j(value.getAng()), CT_AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTConnectionSite toDocx4j(CT_ConnectionSiteModel value) {
    return null;
  }
}
