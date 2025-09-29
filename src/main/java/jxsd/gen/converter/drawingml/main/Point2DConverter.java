package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Point2DModel;
import org.docx4j.dml.CTPoint2D;

/**
 * This is a generated sequence class.
 */
public class Point2DConverter {
  private Point2DConverter() {
  }

  public static Point2DModel fromDocx4j(CTPoint2D value) {
    if (value == null) return null;
    return new Point2DModel(CoordinateValueConverter.fromDocx4j(value.getY()), CoordinateValueConverter.fromDocx4j(value.getX()));
  }

  public static CTPoint2D toDocx4j(Point2DModel value) {
    if (value == null) return null;
    CTPoint2D result = new CTPoint2D();
    result.setY(CoordinateValueConverter.toDocx4j(value.getY()));
    result.setX(CoordinateValueConverter.toDocx4j(value.getX()));
    return result;
  }
}
