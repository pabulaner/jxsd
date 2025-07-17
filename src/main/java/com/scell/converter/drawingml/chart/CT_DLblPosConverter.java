package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DLblPosModel;
import org.docx4j.dml.chart.CTDLblPos;

public class CT_DLblPosConverter {
  private CT_DLblPosConverter() {
  }

  public static CT_DLblPosModel fromDocx4j(CTDLblPos value) {
    if (value == null) return null;
    return new CT_DLblPosModel(ST_DLblPosConverter.fromDocx4j(value.getVal()));
  }

  public static CTDLblPos toDocx4j(CT_DLblPosModel value) {
    return null;
  }
}
