package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.chart.StrValModel;
import org.docx4j.dml.chart.CTStrVal;

/**
 * This is a generated sequence class.
 */
public class StrValConverter {
  private StrValConverter() {
  }

  public static StrValModel fromDocx4j(CTStrVal value) {
    if (value == null) return null;
    return new StrValModel(UnsignedIntValueConverter.fromDocx4j(value.getIdx()), XstringValueConverter.fromDocx4j(value.getV()));
  }

  public static CTStrVal toDocx4j(StrValModel value) {
    if (value == null) return null;
    CTStrVal result = new CTStrVal();
    result.setIdx(UnsignedIntValueConverter.toDocx4j(value.getIdx()));
    result.setV(XstringValueConverter.toDocx4j(value.getV()));
    return result;
  }
}
