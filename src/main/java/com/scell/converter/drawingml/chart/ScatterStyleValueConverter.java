package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterStyleValueModel;
import org.docx4j.dml.chart.STScatterStyle;

public class ScatterStyleValueConverter {
  private ScatterStyleValueConverter() {
  }

  public static ScatterStyleValueModel fromDocx4J(STScatterStyle value) {
    if (value == null) return null;
    if (value == STScatterStyle.NONE) return ScatterStyleValueModel.NONE;
    if (value == STScatterStyle.LINE) return ScatterStyleValueModel.LINE;
    if (value == STScatterStyle.LINE_MARKER) return ScatterStyleValueModel.LINE_MARKER;
    if (value == STScatterStyle.MARKER) return ScatterStyleValueModel.MARKER;
    if (value == STScatterStyle.SMOOTH) return ScatterStyleValueModel.SMOOTH;
    if (value == STScatterStyle.SMOOTH_MARKER) return ScatterStyleValueModel.SMOOTH_MARKER;
    return null;
  }
}
