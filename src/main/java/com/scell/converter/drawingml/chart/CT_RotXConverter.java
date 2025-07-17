package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RotXModel;
import org.docx4j.dml.chart.CTRotX;

public class CT_RotXConverter {
  private CT_RotXConverter() {
  }

  public static CT_RotXModel fromDocx4j(CTRotX value) {
    if (value == null) return null;
    return new CT_RotXModel(ST_RotXConverter.fromDocx4j(value.getVal()));
  }

  public static CTRotX toDocx4j(CT_RotXModel value) {
    return null;
  }
}
