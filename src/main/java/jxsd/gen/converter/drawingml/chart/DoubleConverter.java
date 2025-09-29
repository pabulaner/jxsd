package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.DoubleValueConverter;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import org.docx4j.dml.chart.CTDouble;

/**
 * This is a generated sequence class.
 */
public class DoubleConverter {
  private DoubleConverter() {
  }

  public static DoubleModel fromDocx4j(CTDouble value) {
    if (value == null) return null;
    return new DoubleModel(DoubleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTDouble toDocx4j(DoubleModel value) {
    if (value == null) return null;
    CTDouble result = new CTDouble();
    result.setVal(DoubleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
