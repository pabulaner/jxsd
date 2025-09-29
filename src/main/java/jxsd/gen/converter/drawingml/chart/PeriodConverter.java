package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PeriodModel;
import org.docx4j.dml.chart.CTPeriod;

/**
 * This is a generated sequence class.
 */
public class PeriodConverter {
  private PeriodConverter() {
  }

  public static PeriodModel fromDocx4j(CTPeriod value) {
    if (value == null) return null;
    return new PeriodModel(PeriodValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPeriod toDocx4j(PeriodModel value) {
    if (value == null) return null;
    CTPeriod result = new CTPeriod();
    result.setVal(PeriodValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
