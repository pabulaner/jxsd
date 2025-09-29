package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RotYModel;
import org.docx4j.dml.chart.CTRotY;

/**
 * This is a generated sequence class.
 */
public class RotYConverter {
  private RotYConverter() {
  }

  public static RotYModel fromDocx4j(CTRotY value) {
    if (value == null) return null;
    return new RotYModel(RotYValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTRotY toDocx4j(RotYModel value) {
    if (value == null) return null;
    CTRotY result = new CTRotY();
    result.setVal(RotYValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
