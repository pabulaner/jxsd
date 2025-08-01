package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ErrDirValueModel;
import org.docx4j.dml.chart.STErrDir;

public class ErrDirValueConverter {
  private ErrDirValueConverter() {
  }

  public static ErrDirValueModel fromDocx4J(STErrDir value) {
    if (value == null) return null;
    if (value == STErrDir.X) return ErrDirValueModel.X;
    if (value == STErrDir.Y) return ErrDirValueModel.Y;
    return null;
  }
}
