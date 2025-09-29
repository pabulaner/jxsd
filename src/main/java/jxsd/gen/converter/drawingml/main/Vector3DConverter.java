package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Vector3DModel;
import org.docx4j.dml.CTVector3D;

/**
 * This is a generated sequence class.
 */
public class Vector3DConverter {
  private Vector3DConverter() {
  }

  public static Vector3DModel fromDocx4j(CTVector3D value) {
    if (value == null) return null;
    return new Vector3DModel(CoordinateValueConverter.fromDocx4j(value.getDz()), CoordinateValueConverter.fromDocx4j(value.getDy()), CoordinateValueConverter.fromDocx4j(value.getDx()));
  }

  public static CTVector3D toDocx4j(Vector3DModel value) {
    if (value == null) return null;
    CTVector3D result = new CTVector3D();
    result.setDz(CoordinateValueConverter.toDocx4j(value.getDz()));
    result.setDy(CoordinateValueConverter.toDocx4j(value.getDy()));
    result.setDx(CoordinateValueConverter.toDocx4j(value.getDx()));
    return result;
  }
}
