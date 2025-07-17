package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OverlapModel;
import org.docx4j.dml.chart.CTOverlap;

public class CT_OverlapConverter {
  private CT_OverlapConverter() {
  }

  public static CT_OverlapModel fromDocx4j(CTOverlap value) {
    if (value == null) return null;
    return new CT_OverlapModel(ST_OverlapConverter.fromDocx4j(value.getVal()));
  }

  public static CTOverlap toDocx4j(CT_OverlapModel value) {
    return null;
  }
}
