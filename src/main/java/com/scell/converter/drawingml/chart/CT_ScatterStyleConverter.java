package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScatterStyleModel;
import org.docx4j.dml.chart.CTScatterStyle;

public class CT_ScatterStyleConverter {
  private CT_ScatterStyleConverter() {
  }

  public static CT_ScatterStyleModel fromDocx4J(CTScatterStyle value) {
    if (value == null) return null;
    return new CT_ScatterStyleModel(ST_ScatterStyleConverter.fromDocx4J(value.getVal()));
  }

  public static CTScatterStyle toDocx4J(CT_ScatterStyleModel value) {
    return null;
  }
}
