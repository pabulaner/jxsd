package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxisUnitModel;
import org.docx4j.dml.chart.CTAxisUnit;

/**
 * This is a generated sequence class.
 */
public class AxisUnitConverter {
  private AxisUnitConverter() {
  }

  public static AxisUnitModel fromDocx4j(CTAxisUnit value) {
    if (value == null) return null;
    return new AxisUnitModel(AxisUnitValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTAxisUnit toDocx4j(AxisUnitModel value) {
    if (value == null) return null;
    CTAxisUnit result = new CTAxisUnit();
    result.setVal(AxisUnitValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
