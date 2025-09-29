package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LogBaseModel;
import org.docx4j.dml.chart.CTLogBase;

/**
 * This is a generated sequence class.
 */
public class LogBaseConverter {
  private LogBaseConverter() {
  }

  public static LogBaseModel fromDocx4j(CTLogBase value) {
    if (value == null) return null;
    return new LogBaseModel(LogBaseValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLogBase toDocx4j(LogBaseModel value) {
    if (value == null) return null;
    CTLogBase result = new CTLogBase();
    result.setVal(LogBaseValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
