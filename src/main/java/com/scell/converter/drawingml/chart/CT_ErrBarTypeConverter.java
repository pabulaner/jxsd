package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrBarTypeModel;
import org.docx4j.dml.chart.CTErrBarType;

public class CT_ErrBarTypeConverter {
  private CT_ErrBarTypeConverter() {
  }

  public static CT_ErrBarTypeModel fromDocx4j(CTErrBarType value) {
    if (value == null) return null;
    return new CT_ErrBarTypeModel(ST_ErrBarTypeConverter.fromDocx4j(value.getVal()));
  }

  public static CTErrBarType toDocx4j(CT_ErrBarTypeModel value) {
    return null;
  }
}
