package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LogBaseModel;
import org.docx4j.dml.chart.CTLogBase;

public class CT_LogBaseConverter {
  private CT_LogBaseConverter() {
  }

  public static CT_LogBaseModel fromDocx4J(CTLogBase value) {
    if (value == null) return null;
    return new CT_LogBaseModel(ST_LogBaseConverter.fromDocx4J(value.getVal()));
  }

  public static CTLogBase toDocx4J(CT_LogBaseModel value) {
    return null;
  }
}
