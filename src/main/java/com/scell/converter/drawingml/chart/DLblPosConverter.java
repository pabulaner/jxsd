package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DLblPosModel;
import org.docx4j.dml.chart.CTDLblPos;

public class DLblPosConverter {
  private DLblPosConverter() {
  }

  public static DLblPosModel fromDocx4J(CTDLblPos value) {
    if (value == null) return null;
    return new DLblPosModel(DLblPosValueConverter.fromDocx4J(value.getVal()));
  }
}
