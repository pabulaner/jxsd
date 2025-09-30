package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import org.docx4j.dml.chart.CTNumFmt;

/**
 * This is a generated sequence class.
 */
public class NumFmtConverter {
  private NumFmtConverter() {
  }

  public static NumFmtModel fromDocx4j(CTNumFmt value) {
    if (value == null) return null;
    return new NumFmtModel(XstringValueConverter.fromDocx4j(value.getFormatCode()), BooleanValueConverter.fromDocx4j(value.isSourceLinked()));
  }

  public static CTNumFmt toDocx4j(NumFmtModel value) {
    if (value == null) return null;
    CTNumFmt result = new CTNumFmt();
    result.setFormatCode(XstringValueConverter.toDocx4j(value.getFormatCode()));
    result.setSourceLinked(BooleanValueConverter.toDocx4j(value.getSourceLinked()));
    return result;
  }
}
