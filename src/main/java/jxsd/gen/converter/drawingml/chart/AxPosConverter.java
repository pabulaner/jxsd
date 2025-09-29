package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxPosModel;
import org.docx4j.dml.chart.CTAxPos;

/**
 * This is a generated sequence class.
 */
public class AxPosConverter {
  private AxPosConverter() {
  }

  public static AxPosModel fromDocx4j(CTAxPos value) {
    if (value == null) return null;
    return new AxPosModel(AxPosValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTAxPos toDocx4j(AxPosModel value) {
    if (value == null) return null;
    CTAxPos result = new CTAxPos();
    result.setVal(AxPosValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
