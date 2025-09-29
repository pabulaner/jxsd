package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickLblPosModel;
import org.docx4j.dml.chart.CTTickLblPos;

/**
 * This is a generated sequence class.
 */
public class TickLblPosConverter {
  private TickLblPosConverter() {
  }

  public static TickLblPosModel fromDocx4j(CTTickLblPos value) {
    if (value == null) return null;
    return new TickLblPosModel(TickLblPosValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTickLblPos toDocx4j(TickLblPosModel value) {
    if (value == null) return null;
    CTTickLblPos result = new CTTickLblPos();
    result.setVal(TickLblPosValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
