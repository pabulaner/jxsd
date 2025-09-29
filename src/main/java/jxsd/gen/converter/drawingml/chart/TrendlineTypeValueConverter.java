package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TrendlineTypeValueBuilder;
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
    if (value == TrendlineTypeValueBuilder.EXP) return TrendlineTypeValueModel.EXP;
    if (value == TrendlineTypeValueBuilder.LINEAR) return TrendlineTypeValueModel.LINEAR;
    if (value == TrendlineTypeValueBuilder.LOG) return TrendlineTypeValueModel.LOG;
    if (value == TrendlineTypeValueBuilder.MOVING_AVG) return TrendlineTypeValueModel.MOVING_AVG;
    if (value == TrendlineTypeValueBuilder.POLY) return TrendlineTypeValueModel.POLY;
    if (value == TrendlineTypeValueBuilder.POWER) return TrendlineTypeValueModel.POWER;
    return null;
  }

  public static STTrendlineType toDocx4j(TrendlineTypeValueModel value) {
    if (value == null) return null;
    if (value == TrendlineTypeValueModel.EXP) return TrendlineTypeValueBuilder.EXP;
    if (value == TrendlineTypeValueModel.LINEAR) return TrendlineTypeValueBuilder.LINEAR;
    if (value == TrendlineTypeValueModel.LOG) return TrendlineTypeValueBuilder.LOG;
    if (value == TrendlineTypeValueModel.MOVING_AVG) return TrendlineTypeValueBuilder.MOVING_AVG;
    if (value == TrendlineTypeValueModel.POLY) return TrendlineTypeValueBuilder.POLY;
    if (value == TrendlineTypeValueModel.POWER) return TrendlineTypeValueBuilder.POWER;
    return null;
  }
}
