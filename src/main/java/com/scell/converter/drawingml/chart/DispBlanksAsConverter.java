package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DispBlanksAsModel;
import org.docx4j.dml.chart.CTDispBlanksAs;

public class DispBlanksAsConverter {
  private DispBlanksAsConverter() {
  }

  public static DispBlanksAsModel fromDocx4J(CTDispBlanksAs value) {
    if (value == null) return null;
    return new DispBlanksAsModel(DispBlanksAsConverter.fromDocx4J(value.getVal()));
  }
}
