package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ErrDirModel;
import org.docx4j.dml.chart.STErrDir;

public class ST_ErrDirConverter {
  private ST_ErrDirConverter() {
  }

  public static ST_ErrDirModel fromDocx4J(STErrDir value) {
    if (value == null) return null;
    if (value == STErrDir.X) return ST_ErrDirModel.X;
    if (value == STErrDir.Y) return ST_ErrDirModel.Y;
    return null;
  }

  public static STErrDir toDocx4J(ST_ErrDirModel value) {
    return null;
  }
}
