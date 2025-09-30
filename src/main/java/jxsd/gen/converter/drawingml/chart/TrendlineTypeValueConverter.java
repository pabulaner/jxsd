package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TrendlineTypeValueModel;
import org.docx4j.dml.chart.STTrendlineType;

/**
 * This is a generated enum class.
 */
public class TrendlineTypeValueConverter {
  private TrendlineTypeValueConverter() {
  }

  public static TrendlineTypeValueModel fromDocx4j(STTrendlineType value) {
    if (value == null) return null;
    if (value == STTrendlineType.EXP) return TrendlineTypeValueModel.EXP;
    if (value == STTrendlineType.LINEAR) return TrendlineTypeValueModel.LINEAR;
    if (value == STTrendlineType.LOG) return TrendlineTypeValueModel.LOG;
    if (value == STTrendlineType.MOVING_AVG) return TrendlineTypeValueModel.MOVING_AVG;
    if (value == STTrendlineType.POLY) return TrendlineTypeValueModel.POLY;
    if (value == STTrendlineType.POWER) return TrendlineTypeValueModel.POWER;
    return null;
  }

  public static STTrendlineType toDocx4j(TrendlineTypeValueModel value) {
    if (value == null) return null;
    if (value == TrendlineTypeValueModel.EXP) return STTrendlineType.EXP;
    if (value == TrendlineTypeValueModel.LINEAR) return STTrendlineType.LINEAR;
    if (value == TrendlineTypeValueModel.LOG) return STTrendlineType.LOG;
    if (value == TrendlineTypeValueModel.MOVING_AVG) return STTrendlineType.MOVING_AVG;
    if (value == TrendlineTypeValueModel.POLY) return STTrendlineType.POLY;
    if (value == TrendlineTypeValueModel.POWER) return STTrendlineType.POWER;
    return null;
  }
}
