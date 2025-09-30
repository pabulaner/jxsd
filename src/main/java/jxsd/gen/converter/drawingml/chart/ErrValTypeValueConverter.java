package jxsd.gen.converter.drawingml.chart;

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
    if (value == STErrValType.CUST) return ErrValTypeValueModel.CUST;
    if (value == STErrValType.FIXED_VAL) return ErrValTypeValueModel.FIXED_VAL;
    if (value == STErrValType.PERCENTAGE) return ErrValTypeValueModel.PERCENTAGE;
    if (value == STErrValType.STD_DEV) return ErrValTypeValueModel.STD_DEV;
    if (value == STErrValType.STD_ERR) return ErrValTypeValueModel.STD_ERR;
    return null;
  }

  public static STErrValType toDocx4j(ErrValTypeValueModel value) {
    if (value == null) return null;
    if (value == ErrValTypeValueModel.CUST) return STErrValType.CUST;
    if (value == ErrValTypeValueModel.FIXED_VAL) return STErrValType.FIXED_VAL;
    if (value == ErrValTypeValueModel.PERCENTAGE) return STErrValType.PERCENTAGE;
    if (value == ErrValTypeValueModel.STD_DEV) return STErrValType.STD_DEV;
    if (value == ErrValTypeValueModel.STD_ERR) return STErrValType.STD_ERR;
    return null;
  }
}
