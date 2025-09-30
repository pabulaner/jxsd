package jxsd.gen.converter.drawingml.main;

import java.lang.String;
import jxsd.gen.model.drawingml.main.AdjAngleValueModel;

/**
 * This is a generated union class.
 */
public class AdjAngleValueConverter {
  private AdjAngleValueConverter() {
  }

  public static AdjAngleValueModel fromDocx4j(String value) {
    if (value == null) return null;
    return new AdjAngleValueModel(value);
  }

  public static String toDocx4j(AdjAngleValueModel value) {
    if (value == null) return null;
    return value.getValue();
  }
}
