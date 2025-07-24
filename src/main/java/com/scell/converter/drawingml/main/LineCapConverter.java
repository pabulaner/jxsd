package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineCapModel;
import org.docx4j.dml.STLineCap;

public class LineCapConverter {
  private LineCapConverter() {
  }

  public static LineCapModel fromDocx4J(STLineCap value) {
    if (value == null) return null;
    if (value == STLineCap.RND) return LineCapModel.RND;
    if (value == STLineCap.SQ) return LineCapModel.SQ;
    if (value == STLineCap.FLAT) return LineCapModel.FLAT;
    return null;
  }
}
