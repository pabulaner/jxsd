package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.XYAdjustHandleModel;
import org.docx4j.dml.CTXYAdjustHandle;

/**
 * This is a generated sequence class.
 */
public class XYAdjustHandleConverter {
  private XYAdjustHandleConverter() {
  }

  public static XYAdjustHandleModel fromDocx4j(CTXYAdjustHandle value) {
    if (value == null) return null;
    return new XYAdjustHandleModel(AdjCoordinateValueConverter.fromDocx4j(value.getMaxX()), GeomGuideNameValueConverter.fromDocx4j(value.getGdRefY()), GeomGuideNameValueConverter.fromDocx4j(value.getGdRefX()), AdjCoordinateValueConverter.fromDocx4j(value.getMaxY()), AdjCoordinateValueConverter.fromDocx4j(value.getMinY()), AdjCoordinateValueConverter.fromDocx4j(value.getMinX()), AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTXYAdjustHandle toDocx4j(XYAdjustHandleModel value) {
    if (value == null) return null;
    CTXYAdjustHandle result = new CTXYAdjustHandle();
    result.setMaxX(AdjCoordinateValueConverter.toDocx4j(value.getMaxX()));
    result.setGdRefY(GeomGuideNameValueConverter.toDocx4j(value.getGdRefY()));
    result.setGdRefX(GeomGuideNameValueConverter.toDocx4j(value.getGdRefX()));
    result.setMaxY(AdjCoordinateValueConverter.toDocx4j(value.getMaxY()));
    result.setMinY(AdjCoordinateValueConverter.toDocx4j(value.getMinY()));
    result.setMinX(AdjCoordinateValueConverter.toDocx4j(value.getMinX()));
    result.setPos(AdjPoint2DConverter.toDocx4j(value.getPos()));
    return result;
  }
}
