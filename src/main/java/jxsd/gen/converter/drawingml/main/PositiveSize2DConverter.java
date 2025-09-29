package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveSize2DModel;
import org.docx4j.dml.CTPositiveSize2D;

/**
 * This is a generated sequence class.
 */
public class PositiveSize2DConverter {
  private PositiveSize2DConverter() {
  }

  public static PositiveSize2DModel fromDocx4j(CTPositiveSize2D value) {
    if (value == null) return null;
    return new PositiveSize2DModel(PositiveCoordinateValueConverter.fromDocx4j(value.getCy()), PositiveCoordinateValueConverter.fromDocx4j(value.getCx()));
  }

  public static CTPositiveSize2D toDocx4j(PositiveSize2DModel value) {
    if (value == null) return null;
    CTPositiveSize2D result = new CTPositiveSize2D();
    result.setCy(PositiveCoordinateValueConverter.toDocx4j(value.getCy()));
    result.setCx(PositiveCoordinateValueConverter.toDocx4j(value.getCx()));
    return result;
  }
}
