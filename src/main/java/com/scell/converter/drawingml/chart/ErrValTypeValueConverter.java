package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrValTypeValueModel;
import org.docx4j.dml.chart.STErrValType;

public class ErrValTypeValueConverter {
  private ErrValTypeValueConverter() {
  }

  public static ErrValTypeValueModel fromDocx4J(STErrValType value) {
    if (value == null) return null;
    if (value == STErrValType.CUST) return ErrValTypeValueModel.CUST;
    if (value == STErrValType.FIXED_VAL) return ErrValTypeValueModel.FIXED_VAL;
    if (value == STErrValType.PERCENTAGE) return ErrValTypeValueModel.PERCENTAGE;
    if (value == STErrValType.STD_DEV) return ErrValTypeValueModel.STD_DEV;
    if (value == STErrValType.STD_ERR) return ErrValTypeValueModel.STD_ERR;
    return null;
  }
}
