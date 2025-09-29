package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LegendPosModel;
import org.docx4j.dml.chart.CTLegendPos;

/**
 * This is a generated sequence class.
 */
public class LegendPosConverter {
  private LegendPosConverter() {
  }

  public static LegendPosModel fromDocx4j(CTLegendPos value) {
    if (value == null) return null;
    return new LegendPosModel(LegendPosValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLegendPos toDocx4j(LegendPosModel value) {
    if (value == null) return null;
    CTLegendPos result = new CTLegendPos();
    result.setVal(LegendPosValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
