package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LegendPosValueBuilder;
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
    if (value == LegendPosValueBuilder.B) return LegendPosValueModel.B;
    if (value == LegendPosValueBuilder.TR) return LegendPosValueModel.TR;
    if (value == LegendPosValueBuilder.L) return LegendPosValueModel.L;
    if (value == LegendPosValueBuilder.R) return LegendPosValueModel.R;
    if (value == LegendPosValueBuilder.T) return LegendPosValueModel.T;
    return null;
  }

  public static STLegendPos toDocx4j(LegendPosValueModel value) {
    if (value == null) return null;
    if (value == LegendPosValueModel.B) return LegendPosValueBuilder.B;
    if (value == LegendPosValueModel.TR) return LegendPosValueBuilder.TR;
    if (value == LegendPosValueModel.L) return LegendPosValueBuilder.L;
    if (value == LegendPosValueModel.R) return LegendPosValueBuilder.R;
    if (value == LegendPosValueModel.T) return LegendPosValueBuilder.T;
    return null;
  }
}
