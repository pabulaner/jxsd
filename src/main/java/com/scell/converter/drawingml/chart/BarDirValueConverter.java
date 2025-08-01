package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BarDirValueModel;
import org.docx4j.dml.chart.STBarDir;

public class BarDirValueConverter {
  private BarDirValueConverter() {
  }

  public static BarDirValueModel fromDocx4J(STBarDir value) {
    if (value == null) return null;
    if (value == STBarDir.BAR) return BarDirValueModel.BAR;
    if (value == STBarDir.COL) return BarDirValueModel.COL;
    return null;
  }
}
