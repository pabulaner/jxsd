package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ConnectionSiteModel;
import org.docx4j.dml.CTConnectionSite;

public class CT_ConnectionSiteConverter {
  private CT_ConnectionSiteConverter() {
  }

  public static CT_ConnectionSiteModel fromDocx4J(CTConnectionSite value) {
    if (value == null) return null;
    return new CT_ConnectionSiteModel(ST_AdjAngleConverter.fromDocx4J(value.getAng()), CT_AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }

  public static CTConnectionSite toDocx4J(CT_ConnectionSiteModel value) {
    return null;
  }
}
