package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BarDirModel;
import org.docx4j.dml.chart.CTBarDir;

public class BarDirConverter {
  private BarDirConverter() {
  }

  public static BarDirModel fromDocx4J(CTBarDir value) {
    if (value == null) return null;
    return new BarDirModel(BarDirConverter.fromDocx4J(value.getVal()));
  }
}
