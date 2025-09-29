package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GapAmountModel;
import org.docx4j.dml.chart.CTGapAmount;

/**
 * This is a generated sequence class.
 */
public class GapAmountConverter {
  private GapAmountConverter() {
  }

  public static GapAmountModel fromDocx4j(CTGapAmount value) {
    if (value == null) return null;
    return new GapAmountModel(GapAmountValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTGapAmount toDocx4j(GapAmountModel value) {
    if (value == null) return null;
    CTGapAmount result = new CTGapAmount();
    result.setVal(GapAmountValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
