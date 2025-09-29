package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DLblPosModel;
import org.docx4j.dml.chart.CTDLblPos;

/**
 * This is a generated sequence class.
 */
public class DLblPosConverter {
  private DLblPosConverter() {
  }

  public static DLblPosModel fromDocx4j(CTDLblPos value) {
    if (value == null) return null;
    return new DLblPosModel(DLblPosValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTDLblPos toDocx4j(DLblPosModel value) {
    if (value == null) return null;
    CTDLblPos result = new CTDLblPos();
    result.setVal(DLblPosValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
