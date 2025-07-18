package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrValTypeModel;
import org.docx4j.dml.chart.STErrValType;

public class ST_ErrValTypeConverter {
  private ST_ErrValTypeConverter() {
  }

  public static ST_ErrValTypeModel fromDocx4J(STErrValType value) {
    if (value == null) return null;
    if (value == STErrValType.CUST) return ST_ErrValTypeModel.CUST;
    if (value == STErrValType.FIXED_VAL) return ST_ErrValTypeModel.FIXED_VAL;
    if (value == STErrValType.PERCENTAGE) return ST_ErrValTypeModel.PERCENTAGE;
    if (value == STErrValType.STD_DEV) return ST_ErrValTypeModel.STD_DEV;
    if (value == STErrValType.STD_ERR) return ST_ErrValTypeModel.STD_ERR;
    return null;
  }

  public static STErrValType toDocx4J(ST_ErrValTypeModel value) {
    return null;
  }
}
