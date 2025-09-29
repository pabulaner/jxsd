package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.HPercentModel;
import org.docx4j.dml.chart.CTHPercent;

/**
 * This is a generated sequence class.
 */
public class HPercentConverter {
  private HPercentConverter() {
  }

  public static HPercentModel fromDocx4j(CTHPercent value) {
    if (value == null) return null;
    return new HPercentModel(HPercentValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTHPercent toDocx4j(HPercentModel value) {
    if (value == null) return null;
    CTHPercent result = new CTHPercent();
    result.setVal(HPercentValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
