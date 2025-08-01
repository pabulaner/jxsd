package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DispBlanksAsValueModel;
import org.docx4j.dml.chart.STDispBlanksAs;

public class DispBlanksAsValueConverter {
  private DispBlanksAsValueConverter() {
  }

  public static DispBlanksAsValueModel fromDocx4J(STDispBlanksAs value) {
    if (value == null) return null;
    if (value == STDispBlanksAs.SPAN) return DispBlanksAsValueModel.SPAN;
    if (value == STDispBlanksAs.GAP) return DispBlanksAsValueModel.GAP;
    if (value == STDispBlanksAs.ZERO) return DispBlanksAsValueModel.ZERO;
    return null;
  }
}
