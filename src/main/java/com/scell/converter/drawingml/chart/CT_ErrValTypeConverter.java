package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrValTypeModel;
import org.docx4j.dml.chart.CTErrValType;

public class CT_ErrValTypeConverter {
  private CT_ErrValTypeConverter() {
  }

  public static CT_ErrValTypeModel fromDocx4j(CTErrValType value) {
    if (value == null) return null;
    return new CT_ErrValTypeModel(ST_ErrValTypeConverter.fromDocx4j(value.getVal()));
  }

  public static CTErrValType toDocx4j(CT_ErrValTypeModel value) {
    return null;
  }
}
