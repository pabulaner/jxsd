package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarDirModel;
import org.docx4j.dml.chart.CTBarDir;

public class CT_BarDirConverter {
  private CT_BarDirConverter() {
  }

  public static CT_BarDirModel fromDocx4J(CTBarDir value) {
    if (value == null) return null;
    return new CT_BarDirModel(ST_BarDirConverter.fromDocx4J(value.getVal()));
  }

  public static CTBarDir toDocx4J(CT_BarDirModel value) {
    return null;
  }
}
