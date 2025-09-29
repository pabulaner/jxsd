package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import org.docx4j.dml.CTAdjPoint2D;

/**
 * This is a generated sequence class.
 */
public class AdjPoint2DConverter {
  private AdjPoint2DConverter() {
  }

  public static AdjPoint2DModel fromDocx4j(CTAdjPoint2D value) {
    if (value == null) return null;
    return new AdjPoint2DModel(AdjCoordinateValueConverter.fromDocx4j(value.getY()), AdjCoordinateValueConverter.fromDocx4j(value.getX()));
  }

  public static CTAdjPoint2D toDocx4j(AdjPoint2DModel value) {
    if (value == null) return null;
    CTAdjPoint2D result = new CTAdjPoint2D();
    result.setY(AdjCoordinateValueConverter.toDocx4j(value.getY()));
    result.setX(AdjCoordinateValueConverter.toDocx4j(value.getX()));
    return result;
  }
}
