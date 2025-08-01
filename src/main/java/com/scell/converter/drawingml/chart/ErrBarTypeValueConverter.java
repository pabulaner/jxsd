package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrBarTypeValueModel;
import org.docx4j.dml.chart.STErrBarType;

public class ErrBarTypeValueConverter {
  private ErrBarTypeValueConverter() {
  }

  public static ErrBarTypeValueModel fromDocx4J(STErrBarType value) {
    if (value == null) return null;
    if (value == STErrBarType.BOTH) return ErrBarTypeValueModel.BOTH;
    if (value == STErrBarType.MINUS) return ErrBarTypeValueModel.MINUS;
    if (value == STErrBarType.PLUS) return ErrBarTypeValueModel.PLUS;
    return null;
  }
}
