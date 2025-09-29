package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.HoleSizeModel;
import org.docx4j.dml.chart.CTHoleSize;

/**
 * This is a generated sequence class.
 */
public class HoleSizeConverter {
  private HoleSizeConverter() {
  }

  public static HoleSizeModel fromDocx4j(CTHoleSize value) {
    if (value == null) return null;
    return new HoleSizeModel(HoleSizeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTHoleSize toDocx4j(HoleSizeModel value) {
    if (value == null) return null;
    CTHoleSize result = new CTHoleSize();
    result.setVal(HoleSizeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
