package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ConnectionSiteModel;
import org.docx4j.dml.CTConnectionSite;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteConverter {
  private ConnectionSiteConverter() {
  }

  public static ConnectionSiteModel fromDocx4j(CTConnectionSite value) {
    if (value == null) return null;
    return new ConnectionSiteModel(AdjAngleValueConverter.fromDocx4j(value.getAng()), AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTConnectionSite toDocx4j(ConnectionSiteModel value) {
    if (value == null) return null;
    CTConnectionSite result = new CTConnectionSite();
    result.setAng(AdjAngleValueConverter.toDocx4j(value.getAng()));
    result.setPos(AdjPoint2DConverter.toDocx4j(value.getPos()));
    return result;
  }
}
