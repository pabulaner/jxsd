package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PathShadeTypeModel;
import org.docx4j.dml.STPathShadeType;

public class PathShadeTypeConverter {
  private PathShadeTypeConverter() {
  }

  public static PathShadeTypeModel fromDocx4J(STPathShadeType value) {
    if (value == null) return null;
    if (value == STPathShadeType.SHAPE) return PathShadeTypeModel.SHAPE;
    if (value == STPathShadeType.CIRCLE) return PathShadeTypeModel.CIRCLE;
    if (value == STPathShadeType.RECT) return PathShadeTypeModel.RECT;
    return null;
  }
}
