package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ScatterStyleModel;
import org.docx4j.dml.chart.STScatterStyle;

public class ST_ScatterStyleConverter {
  private ST_ScatterStyleConverter() {
  }

  public static ST_ScatterStyleModel fromDocx4j(STScatterStyle value) {
    if (value == null) return null;
    if (value == STScatterStyle.NONE) return ST_ScatterStyleModel.NONE;
    if (value == STScatterStyle.LINE) return ST_ScatterStyleModel.LINE;
    if (value == STScatterStyle.LINE_MARKER) return ST_ScatterStyleModel.LINE_MARKER;
    if (value == STScatterStyle.MARKER) return ST_ScatterStyleModel.MARKER;
    if (value == STScatterStyle.SMOOTH) return ST_ScatterStyleModel.SMOOTH;
    if (value == STScatterStyle.SMOOTH_MARKER) return ST_ScatterStyleModel.SMOOTH_MARKER;
    return null;
  }

  public static STScatterStyle toDocx4j(ST_ScatterStyleModel value) {
    return null;
  }
}
