package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PathShadeTypeModel;
import org.docx4j.dml.STPathShadeType;

public class ST_PathShadeTypeConverter {
  private ST_PathShadeTypeConverter() {
  }

  public static ST_PathShadeTypeModel fromDocx4J(STPathShadeType value) {
    if (value == null) return null;
    if (value == STPathShadeType.SHAPE) return ST_PathShadeTypeModel.SHAPE;
    if (value == STPathShadeType.CIRCLE) return ST_PathShadeTypeModel.CIRCLE;
    if (value == STPathShadeType.RECT) return ST_PathShadeTypeModel.RECT;
    return null;
  }

  public static STPathShadeType toDocx4J(ST_PathShadeTypeModel value) {
    return null;
  }
}
