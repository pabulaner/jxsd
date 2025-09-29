package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrBarTypeModel;
import org.docx4j.dml.chart.CTErrBarType;

/**
 * This is a generated sequence class.
 */
public class ErrBarTypeConverter {
  private ErrBarTypeConverter() {
  }

  public static ErrBarTypeModel fromDocx4j(CTErrBarType value) {
    if (value == null) return null;
    return new ErrBarTypeModel(ErrBarTypeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTErrBarType toDocx4j(ErrBarTypeModel value) {
    if (value == null) return null;
    CTErrBarType result = new CTErrBarType();
    result.setVal(ErrBarTypeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
