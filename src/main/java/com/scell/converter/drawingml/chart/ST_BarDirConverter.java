package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BarDirModel;
import org.docx4j.dml.chart.STBarDir;

public class ST_BarDirConverter {
  private ST_BarDirConverter() {
  }

  public static ST_BarDirModel fromDocx4j(STBarDir value) {
    if (value == null) return null;
    if (value == STBarDir.BAR) return ST_BarDirModel.BAR;
    if (value == STBarDir.COL) return ST_BarDirModel.COL;
    return null;
  }

  public static STBarDir toDocx4j(ST_BarDirModel value) {
    return null;
  }
}
