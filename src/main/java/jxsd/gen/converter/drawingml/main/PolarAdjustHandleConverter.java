package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PolarAdjustHandleModel;
import org.docx4j.dml.CTPolarAdjustHandle;

/**
 * This is a generated sequence class.
 */
public class PolarAdjustHandleConverter {
  private PolarAdjustHandleConverter() {
  }

  public static PolarAdjustHandleModel fromDocx4j(CTPolarAdjustHandle value) {
    if (value == null) return null;
    return new PolarAdjustHandleModel(GeomGuideNameValueConverter.fromDocx4j(value.getGdRefAng()), GeomGuideNameValueConverter.fromDocx4j(value.getGdRefR()), AdjAngleValueConverter.fromDocx4j(value.getMaxAng()), AdjAngleValueConverter.fromDocx4j(value.getMinAng()), AdjCoordinateValueConverter.fromDocx4j(value.getMaxR()), AdjCoordinateValueConverter.fromDocx4j(value.getMinR()), AdjPoint2DConverter.fromDocx4j(value.getPos()));
  }

  public static CTPolarAdjustHandle toDocx4j(PolarAdjustHandleModel value) {
    if (value == null) return null;
    CTPolarAdjustHandle result = new CTPolarAdjustHandle();
    result.setGdRefAng(GeomGuideNameValueConverter.toDocx4j(value.getGdRefAng()));
    result.setGdRefR(GeomGuideNameValueConverter.toDocx4j(value.getGdRefR()));
    result.setMaxAng(AdjAngleValueConverter.toDocx4j(value.getMaxAng()));
    result.setMinAng(AdjAngleValueConverter.toDocx4j(value.getMinAng()));
    result.setMaxR(AdjCoordinateValueConverter.toDocx4j(value.getMaxR()));
    result.setMinR(AdjCoordinateValueConverter.toDocx4j(value.getMinR()));
    result.setPos(AdjPoint2DConverter.toDocx4j(value.getPos()));
    return result;
  }
}
