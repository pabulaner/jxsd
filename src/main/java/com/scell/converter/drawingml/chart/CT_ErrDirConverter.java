package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ErrDirModel;
import org.docx4j.dml.chart.CTErrDir;

public class CT_ErrDirConverter {
  private CT_ErrDirConverter() {
  }

  public static CT_ErrDirModel fromDocx4J(CTErrDir value) {
    if (value == null) return null;
    return new CT_ErrDirModel(ST_ErrDirConverter.fromDocx4J(value.getVal()));
  }

  public static CTErrDir toDocx4J(CT_ErrDirModel value) {
    return null;
  }
}
