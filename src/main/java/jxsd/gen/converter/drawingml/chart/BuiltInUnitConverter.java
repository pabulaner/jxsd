package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BuiltInUnitModel;
import org.docx4j.dml.chart.CTBuiltInUnit;

/**
 * This is a generated sequence class.
 */
public class BuiltInUnitConverter {
  private BuiltInUnitConverter() {
  }

  public static BuiltInUnitModel fromDocx4j(CTBuiltInUnit value) {
    if (value == null) return null;
    return new BuiltInUnitModel(BuiltInUnitValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTBuiltInUnit toDocx4j(BuiltInUnitModel value) {
    if (value == null) return null;
    CTBuiltInUnit result = new CTBuiltInUnit();
    result.setVal(BuiltInUnitValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
