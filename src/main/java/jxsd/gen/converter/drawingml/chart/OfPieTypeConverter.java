package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OfPieTypeModel;
import org.docx4j.dml.chart.CTOfPieType;

/**
 * This is a generated sequence class.
 */
public class OfPieTypeConverter {
  private OfPieTypeConverter() {
  }

  public static OfPieTypeModel fromDocx4j(CTOfPieType value) {
    if (value == null) return null;
    return new OfPieTypeModel(OfPieTypeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTOfPieType toDocx4j(OfPieTypeModel value) {
    if (value == null) return null;
    CTOfPieType result = new CTOfPieType();
    result.setVal(OfPieTypeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
