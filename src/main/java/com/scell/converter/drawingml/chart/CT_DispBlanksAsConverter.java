package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DispBlanksAsModel;
import org.docx4j.dml.chart.CTDispBlanksAs;

public class CT_DispBlanksAsConverter {
  private CT_DispBlanksAsConverter() {
  }

  public static CT_DispBlanksAsModel fromDocx4j(CTDispBlanksAs value) {
    if (value == null) return null;
    return new CT_DispBlanksAsModel(ST_DispBlanksAsConverter.fromDocx4j(value.getVal()));
  }

  public static CTDispBlanksAs toDocx4j(CT_DispBlanksAsModel value) {
    return null;
  }
}
