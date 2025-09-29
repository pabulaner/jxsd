package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SizeRepresentsModel;
import org.docx4j.dml.chart.CTSizeRepresents;

/**
 * This is a generated sequence class.
 */
public class SizeRepresentsConverter {
  private SizeRepresentsConverter() {
  }

  public static SizeRepresentsModel fromDocx4j(CTSizeRepresents value) {
    if (value == null) return null;
    return new SizeRepresentsModel(SizeRepresentsValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTSizeRepresents toDocx4j(SizeRepresentsModel value) {
    if (value == null) return null;
    CTSizeRepresents result = new CTSizeRepresents();
    result.setVal(SizeRepresentsValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
