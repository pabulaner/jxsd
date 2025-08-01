package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrBarTypeModel;
import org.docx4j.dml.chart.CTErrBarType;

public class ErrBarTypeConverter {
  private ErrBarTypeConverter() {
  }

  public static ErrBarTypeModel fromDocx4J(CTErrBarType value) {
    if (value == null) return null;
    return new ErrBarTypeModel(ErrBarTypeValueConverter.fromDocx4J(value.getVal()));
  }
}
