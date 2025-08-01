package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrDirModel;
import org.docx4j.dml.chart.CTErrDir;

public class ErrDirConverter {
  private ErrDirConverter() {
  }

  public static ErrDirModel fromDocx4J(CTErrDir value) {
    if (value == null) return null;
    return new ErrDirModel(ErrDirValueConverter.fromDocx4J(value.getVal()));
  }
}
