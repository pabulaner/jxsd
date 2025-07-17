package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrBarTypeModel;
import org.docx4j.dml.chart.STErrBarType;

public class ST_ErrBarTypeConverter {
  private ST_ErrBarTypeConverter() {
  }

  public static ST_ErrBarTypeModel fromDocx4j(STErrBarType value) {
    if (value == null) return null;
    if (value == STErrBarType.BOTH) return ST_ErrBarTypeModel.BOTH;
    if (value == STErrBarType.MINUS) return ST_ErrBarTypeModel.MINUS;
    if (value == STErrBarType.PLUS) return ST_ErrBarTypeModel.PLUS;
    return null;
  }

  public static STErrBarType toDocx4j(ST_ErrBarTypeModel value) {
    return null;
  }
}
