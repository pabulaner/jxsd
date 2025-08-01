package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrValTypeModel;
import org.docx4j.dml.chart.CTErrValType;

public class ErrValTypeConverter {
  private ErrValTypeConverter() {
  }

  public static ErrValTypeModel fromDocx4J(CTErrValType value) {
    if (value == null) return null;
    return new ErrValTypeModel(ErrValTypeValueConverter.fromDocx4J(value.getVal()));
  }
}
