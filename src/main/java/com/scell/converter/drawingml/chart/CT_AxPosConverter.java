package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxPosModel;
import org.docx4j.dml.chart.CTAxPos;

public class CT_AxPosConverter {
  private CT_AxPosConverter() {
  }

  public static CT_AxPosModel fromDocx4j(CTAxPos value) {
    if (value == null) return null;
    return new CT_AxPosModel(ST_AxPosConverter.fromDocx4j(value.getVal()));
  }

  public static CTAxPos toDocx4j(CT_AxPosModel value) {
    return null;
  }
}
