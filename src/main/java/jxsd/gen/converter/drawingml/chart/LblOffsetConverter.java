package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LblOffsetModel;
import org.docx4j.dml.chart.CTLblOffset;

/**
 * This is a generated sequence class.
 */
public class LblOffsetConverter {
  private LblOffsetConverter() {
  }

  public static LblOffsetModel fromDocx4j(CTLblOffset value) {
    if (value == null) return null;
    return new LblOffsetModel(LblOffsetValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLblOffset toDocx4j(LblOffsetModel value) {
    if (value == null) return null;
    CTLblOffset result = new CTLblOffset();
    result.setVal(LblOffsetValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
