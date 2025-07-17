package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LineCapModel;
import org.docx4j.dml.STLineCap;

public class ST_LineCapConverter {
  private ST_LineCapConverter() {
  }

  public static ST_LineCapModel fromDocx4j(STLineCap value) {
    if (value == null) return null;
    if (value == STLineCap.RND) return ST_LineCapModel.RND;
    if (value == STLineCap.SQ) return ST_LineCapModel.SQ;
    if (value == STLineCap.FLAT) return ST_LineCapModel.FLAT;
    return null;
  }

  public static STLineCap toDocx4j(ST_LineCapModel value) {
    return null;
  }
}
