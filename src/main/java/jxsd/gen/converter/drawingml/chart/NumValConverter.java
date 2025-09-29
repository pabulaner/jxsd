package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.chart.NumValModel;
import org.docx4j.dml.chart.CTNumVal;

/**
 * This is a generated sequence class.
 */
public class NumValConverter {
  private NumValConverter() {
  }

  public static NumValModel fromDocx4j(CTNumVal value) {
    if (value == null) return null;
    return new NumValModel(XstringValueConverter.fromDocx4j(value.getFormatCode()), UnsignedIntValueConverter.fromDocx4j(value.getIdx()), XstringValueConverter.fromDocx4j(value.getV()));
  }

  public static CTNumVal toDocx4j(NumValModel value) {
    if (value == null) return null;
    CTNumVal result = new CTNumVal();
    result.setFormatCode(XstringValueConverter.toDocx4j(value.getFormatCode()));
    result.setIdx(UnsignedIntValueConverter.toDocx4j(value.getIdx()));
    result.setV(XstringValueConverter.toDocx4j(value.getV()));
    return result;
  }
}
