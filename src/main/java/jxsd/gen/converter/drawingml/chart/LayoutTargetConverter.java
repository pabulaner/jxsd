package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutTargetModel;
import org.docx4j.dml.chart.CTLayoutTarget;

/**
 * This is a generated sequence class.
 */
public class LayoutTargetConverter {
  private LayoutTargetConverter() {
  }

  public static LayoutTargetModel fromDocx4j(CTLayoutTarget value) {
    if (value == null) return null;
    return new LayoutTargetModel(LayoutTargetValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLayoutTarget toDocx4j(LayoutTargetModel value) {
    if (value == null) return null;
    CTLayoutTarget result = new CTLayoutTarget();
    result.setVal(LayoutTargetValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
