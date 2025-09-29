package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.CustomGeometry2DModel;
import org.docx4j.dml.CTCustomGeometry2D;

/**
 * This is a generated sequence class.
 */
public class CustomGeometry2DConverter {
  private CustomGeometry2DConverter() {
  }

  public static CustomGeometry2DModel fromDocx4j(CTCustomGeometry2D value) {
    if (value == null) return null;
    return new CustomGeometry2DModel(GeomGuideListConverter.fromDocx4j(value.getAvLst()), GeomGuideListConverter.fromDocx4j(value.getGdLst()), AdjustHandleListConverter.fromDocx4j(value.getAhLst()), ConnectionSiteListConverter.fromDocx4j(value.getCxnLst()), GeomRectConverter.fromDocx4j(value.getRect()), Path2DListConverter.fromDocx4j(value.getPathLst()));
  }

  public static CTCustomGeometry2D toDocx4j(CustomGeometry2DModel value) {
    if (value == null) return null;
    CTCustomGeometry2D result = new CTCustomGeometry2D();
    result.setAvLst(GeomGuideListConverter.toDocx4j(value.getAvLst()));
    result.setGdLst(GeomGuideListConverter.toDocx4j(value.getGdLst()));
    result.setAhLst(AdjustHandleListConverter.toDocx4j(value.getAhLst()));
    result.setCxnLst(ConnectionSiteListConverter.toDocx4j(value.getCxnLst()));
    result.setRect(GeomRectConverter.toDocx4j(value.getRect()));
    result.setPathLst(Path2DListConverter.toDocx4j(value.getPathLst()));
    return result;
  }
}
