package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DispBlanksAsModel;
import org.docx4j.dml.chart.CTDispBlanksAs;

/**
 * This is a generated sequence class.
 */
public class DispBlanksAsConverter {
  private DispBlanksAsConverter() {
  }

  public static DispBlanksAsModel fromDocx4j(CTDispBlanksAs value) {
    if (value == null) return null;
    return new DispBlanksAsModel(DispBlanksAsValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTDispBlanksAs toDocx4j(DispBlanksAsModel value) {
    if (value == null) return null;
    CTDispBlanksAs result = new CTDispBlanksAs();
    result.setVal(DispBlanksAsValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
