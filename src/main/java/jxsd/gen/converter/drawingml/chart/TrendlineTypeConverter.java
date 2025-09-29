package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TrendlineTypeModel;
import org.docx4j.dml.chart.CTTrendlineType;

/**
 * This is a generated sequence class.
 */
public class TrendlineTypeConverter {
  private TrendlineTypeConverter() {
  }

  public static TrendlineTypeModel fromDocx4j(CTTrendlineType value) {
    if (value == null) return null;
    return new TrendlineTypeModel(TrendlineTypeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTrendlineType toDocx4j(TrendlineTypeModel value) {
    if (value == null) return null;
    CTTrendlineType result = new CTTrendlineType();
    result.setVal(TrendlineTypeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
