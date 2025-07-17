package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DispBlanksAsModel;
import org.docx4j.dml.chart.STDispBlanksAs;

public class ST_DispBlanksAsConverter {
  private ST_DispBlanksAsConverter() {
  }

  public static ST_DispBlanksAsModel fromDocx4j(STDispBlanksAs value) {
    if (value == null) return null;
    if (value == STDispBlanksAs.SPAN) return ST_DispBlanksAsModel.SPAN;
    if (value == STDispBlanksAs.GAP) return ST_DispBlanksAsModel.GAP;
    if (value == STDispBlanksAs.ZERO) return ST_DispBlanksAsModel.ZERO;
    return null;
  }

  public static STDispBlanksAs toDocx4j(ST_DispBlanksAsModel value) {
    return null;
  }
}
