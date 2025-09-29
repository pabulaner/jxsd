package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrValTypeModel;
import org.docx4j.dml.chart.CTErrValType;

/**
 * This is a generated sequence class.
 */
public class ErrValTypeConverter {
  private ErrValTypeConverter() {
  }

  public static ErrValTypeModel fromDocx4j(CTErrValType value) {
    if (value == null) return null;
    return new ErrValTypeModel(ErrValTypeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTErrValType toDocx4j(ErrValTypeModel value) {
    if (value == null) return null;
    CTErrValType result = new CTErrValType();
    result.setVal(ErrValTypeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
