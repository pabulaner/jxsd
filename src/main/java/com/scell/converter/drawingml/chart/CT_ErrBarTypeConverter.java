package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrBarTypeModel;
import org.docx4j.dml.chart.CTErrBarType;

public class CT_ErrBarTypeConverter {
  private CT_ErrBarTypeConverter() {
  }

  public static CT_ErrBarTypeModel fromDocx4J(CTErrBarType value) {
    if (value == null) return null;
    return new CT_ErrBarTypeModel(ST_ErrBarTypeConverter.fromDocx4J(value.getVal()));
  }

  public static CTErrBarType toDocx4J(CT_ErrBarTypeModel value) {
    return null;
  }
}
