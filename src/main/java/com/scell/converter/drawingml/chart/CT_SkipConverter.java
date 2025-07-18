package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SkipModel;
import org.docx4j.dml.chart.CTSkip;

public class CT_SkipConverter {
  private CT_SkipConverter() {
  }

  public static CT_SkipModel fromDocx4J(CTSkip value) {
    if (value == null) return null;
    return new CT_SkipModel(ST_SkipConverter.fromDocx4J(value.getVal()));
  }

  public static CTSkip toDocx4J(CT_SkipModel value) {
    return null;
  }
}
