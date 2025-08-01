package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineCapValueModel;
import org.docx4j.dml.STLineCap;

public class LineCapValueConverter {
  private LineCapValueConverter() {
  }

  public static LineCapValueModel fromDocx4J(STLineCap value) {
    if (value == null) return null;
    if (value == STLineCap.RND) return LineCapValueModel.RND;
    if (value == STLineCap.SQ) return LineCapValueModel.SQ;
    if (value == STLineCap.FLAT) return LineCapValueModel.FLAT;
    return null;
  }
}
