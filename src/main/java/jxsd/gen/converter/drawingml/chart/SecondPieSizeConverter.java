package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SecondPieSizeModel;
import org.docx4j.dml.chart.CTSecondPieSize;

/**
 * This is a generated sequence class.
 */
public class SecondPieSizeConverter {
  private SecondPieSizeConverter() {
  }

  public static SecondPieSizeModel fromDocx4j(CTSecondPieSize value) {
    if (value == null) return null;
    return new SecondPieSizeModel(SecondPieSizeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTSecondPieSize toDocx4j(SecondPieSizeModel value) {
    if (value == null) return null;
    CTSecondPieSize result = new CTSecondPieSize();
    result.setVal(SecondPieSizeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
