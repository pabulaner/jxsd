package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OfPieTypeValueModel;
import org.docx4j.dml.chart.STOfPieType;

/**
 * This is a generated enum class.
 */
public class OfPieTypeValueConverter {
  private OfPieTypeValueConverter() {
  }

  public static OfPieTypeValueModel fromDocx4j(STOfPieType value) {
    if (value == null) return null;
    if (value == STOfPieType.PIE) return OfPieTypeValueModel.PIE;
    if (value == STOfPieType.BAR) return OfPieTypeValueModel.BAR;
    return null;
  }

  public static STOfPieType toDocx4j(OfPieTypeValueModel value) {
    if (value == null) return null;
    if (value == OfPieTypeValueModel.PIE) return STOfPieType.PIE;
    if (value == OfPieTypeValueModel.BAR) return STOfPieType.BAR;
    return null;
  }
}
