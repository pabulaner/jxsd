package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Point3DModel;
import org.docx4j.dml.CTPoint3D;

/**
 * This is a generated sequence class.
 */
public class Point3DConverter {
  private Point3DConverter() {
  }

  public static Point3DModel fromDocx4j(CTPoint3D value) {
    if (value == null) return null;
    return new Point3DModel(CoordinateValueConverter.fromDocx4j(value.getY()), CoordinateValueConverter.fromDocx4j(value.getX()), CoordinateValueConverter.fromDocx4j(value.getZ()));
  }

  public static CTPoint3D toDocx4j(Point3DModel value) {
    if (value == null) return null;
    CTPoint3D result = new CTPoint3D();
    result.setY(CoordinateValueConverter.toDocx4j(value.getY()));
    result.setX(CoordinateValueConverter.toDocx4j(value.getX()));
    result.setZ(CoordinateValueConverter.toDocx4j(value.getZ()));
    return result;
  }
}
