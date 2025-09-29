package jxsd.gen.converter.drawingml.main;

import java.lang.String;
import jxsd.gen.model.drawingml.main.AdjCoordinateValueModel;

/**
 * This is a generated union class.
 */
public class AdjCoordinateValueConverter {
  private AdjCoordinateValueConverter() {
  }

  public static AdjCoordinateValueModel fromDocx4j(String value) {
    if (value == null) return null;
    return new AdjCoordinateValueModel(value);
  }

  public static String toDocx4j(AdjCoordinateValueModel value) {
    if (value == null) return null;
  }
}
