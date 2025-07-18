package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import org.docx4j.dml.chart.CTAxPos;

public class CT_AxPosConverter {
  private CT_AxPosConverter() {
  }

  public static CT_AxPosModel fromDocx4J(CTAxPos value) {
    if (value == null) return null;
    return new CT_AxPosModel(ST_AxPosConverter.fromDocx4J(value.getVal()));
  }

  public static CTAxPos toDocx4J(CT_AxPosModel value) {
    return null;
  }
}
