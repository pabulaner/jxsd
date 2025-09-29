package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RotXModel;
import org.docx4j.dml.chart.CTRotX;

/**
 * This is a generated sequence class.
 */
public class RotXConverter {
  private RotXConverter() {
  }

  public static RotXModel fromDocx4j(CTRotX value) {
    if (value == null) return null;
    return new RotXModel(RotXValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTRotX toDocx4j(RotXModel value) {
    if (value == null) return null;
    CTRotX result = new CTRotX();
    result.setVal(RotXValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
