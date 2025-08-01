package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SkipModel;
import org.docx4j.dml.chart.CTSkip;

public class SkipConverter {
  private SkipConverter() {
  }

  public static SkipModel fromDocx4J(CTSkip value) {
    if (value == null) return null;
    return new SkipModel(SkipValueConverter.fromDocx4J(value.getVal()));
  }
}
