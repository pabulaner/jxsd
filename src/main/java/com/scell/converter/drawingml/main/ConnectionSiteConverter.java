package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ConnectionSiteModel;
import org.docx4j.dml.CTConnectionSite;

public class ConnectionSiteConverter {
  private ConnectionSiteConverter() {
  }

  public static ConnectionSiteModel fromDocx4J(CTConnectionSite value) {
    if (value == null) return null;
    return new ConnectionSiteModel(AdjAngleValueConverter.fromDocx4J(value.getAng()), AdjPoint2DConverter.fromDocx4J(value.getPos()));
  }
}
