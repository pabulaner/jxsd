package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ProtectionModel;
import org.docx4j.dml.chart.CTProtection;

/**
 * This is a generated sequence class.
 */
public class ProtectionConverter {
  private ProtectionConverter() {
  }

  public static ProtectionModel fromDocx4j(CTProtection value) {
    if (value == null) return null;
    return new ProtectionModel(BooleanConverter.fromDocx4j(value.getChartObject()), BooleanConverter.fromDocx4j(value.getData()), BooleanConverter.fromDocx4j(value.getFormatting()), BooleanConverter.fromDocx4j(value.getSelection()), BooleanConverter.fromDocx4j(value.getUserInterface()));
  }

  public static CTProtection toDocx4j(ProtectionModel value) {
    if (value == null) return null;
    CTProtection result = new CTProtection();
    result.setChartObject(BooleanConverter.toDocx4j(value.getChartObject()));
    result.setData(BooleanConverter.toDocx4j(value.getData()));
    result.setFormatting(BooleanConverter.toDocx4j(value.getFormatting()));
    result.setSelection(BooleanConverter.toDocx4j(value.getSelection()));
    result.setUserInterface(BooleanConverter.toDocx4j(value.getUserInterface()));
    return result;
  }
}
