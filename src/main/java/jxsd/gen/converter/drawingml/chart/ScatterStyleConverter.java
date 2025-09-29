package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ScatterStyleModel;
import org.docx4j.dml.chart.CTScatterStyle;

/**
 * This is a generated sequence class.
 */
public class ScatterStyleConverter {
  private ScatterStyleConverter() {
  }

  public static ScatterStyleModel fromDocx4j(CTScatterStyle value) {
    if (value == null) return null;
    return new ScatterStyleModel(ScatterStyleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTScatterStyle toDocx4j(ScatterStyleModel value) {
    if (value == null) return null;
    CTScatterStyle result = new CTScatterStyle();
    result.setVal(ScatterStyleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
