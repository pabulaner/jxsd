package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DepthPercentModel;
import org.docx4j.dml.chart.CTDepthPercent;

/**
 * This is a generated sequence class.
 */
public class DepthPercentConverter {
  private DepthPercentConverter() {
  }

  public static DepthPercentModel fromDocx4j(CTDepthPercent value) {
    if (value == null) return null;
    return new DepthPercentModel(DepthPercentValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTDepthPercent toDocx4j(DepthPercentModel value) {
    if (value == null) return null;
    CTDepthPercent result = new CTDepthPercent();
    result.setVal(DepthPercentValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
