package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrValTypeValueBuilder;
import jxsd.gen.model.drawingml.chart.ErrValTypeValueModel;
import org.docx4j.dml.chart.STErrValType;

/**
 * This is a generated enum class.
 */
public class ErrValTypeValueConverter {
  private ErrValTypeValueConverter() {
  }

  public static ErrValTypeValueModel fromDocx4j(STErrValType value) {
    if (value == null) return null;
    if (value == ErrValTypeValueBuilder.CUST) return ErrValTypeValueModel.CUST;
    if (value == ErrValTypeValueBuilder.FIXED_VAL) return ErrValTypeValueModel.FIXED_VAL;
    if (value == ErrValTypeValueBuilder.PERCENTAGE) return ErrValTypeValueModel.PERCENTAGE;
    if (value == ErrValTypeValueBuilder.STD_DEV) return ErrValTypeValueModel.STD_DEV;
    if (value == ErrValTypeValueBuilder.STD_ERR) return ErrValTypeValueModel.STD_ERR;
    return null;
  }

  public static STErrValType toDocx4j(ErrValTypeValueModel value) {
    if (value == null) return null;
    if (value == ErrValTypeValueModel.CUST) return ErrValTypeValueBuilder.CUST;
    if (value == ErrValTypeValueModel.FIXED_VAL) return ErrValTypeValueBuilder.FIXED_VAL;
    if (value == ErrValTypeValueModel.PERCENTAGE) return ErrValTypeValueBuilder.PERCENTAGE;
    if (value == ErrValTypeValueModel.STD_DEV) return ErrValTypeValueBuilder.STD_DEV;
    if (value == ErrValTypeValueModel.STD_ERR) return ErrValTypeValueBuilder.STD_ERR;
    return null;
  }
}
