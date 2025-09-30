package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LegendPosValueModel;
import org.docx4j.dml.chart.STLegendPos;

/**
 * This is a generated enum class.
 */
public class LegendPosValueConverter {
  private LegendPosValueConverter() {
  }

  public static LegendPosValueModel fromDocx4j(STLegendPos value) {
    if (value == null) return null;
    if (value == STLegendPos.B) return LegendPosValueModel.B;
    if (value == STLegendPos.TR) return LegendPosValueModel.TR;
    if (value == STLegendPos.L) return LegendPosValueModel.L;
    if (value == STLegendPos.R) return LegendPosValueModel.R;
    if (value == STLegendPos.T) return LegendPosValueModel.T;
    return null;
  }

  public static STLegendPos toDocx4j(LegendPosValueModel value) {
    if (value == null) return null;
    if (value == LegendPosValueModel.B) return STLegendPos.B;
    if (value == LegendPosValueModel.TR) return STLegendPos.TR;
    if (value == LegendPosValueModel.L) return STLegendPos.L;
    if (value == LegendPosValueModel.R) return STLegendPos.R;
    if (value == LegendPosValueModel.T) return STLegendPos.T;
    return null;
  }
}
