package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OverlapModel;
import org.docx4j.dml.chart.CTOverlap;

public class CT_OverlapConverter {
  private CT_OverlapConverter() {
  }

  public static CT_OverlapModel fromDocx4J(CTOverlap value) {
    if (value == null) return null;
    return new CT_OverlapModel(ST_OverlapConverter.fromDocx4J(value.getVal()));
  }

  public static CTOverlap toDocx4J(CT_OverlapModel value) {
    return null;
  }
}
