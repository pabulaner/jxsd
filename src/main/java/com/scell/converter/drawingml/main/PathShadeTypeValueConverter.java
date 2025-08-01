package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PathShadeTypeValueModel;
import org.docx4j.dml.STPathShadeType;

public class PathShadeTypeValueConverter {
  private PathShadeTypeValueConverter() {
  }

  public static PathShadeTypeValueModel fromDocx4J(STPathShadeType value) {
    if (value == null) return null;
    if (value == STPathShadeType.SHAPE) return PathShadeTypeValueModel.SHAPE;
    if (value == STPathShadeType.CIRCLE) return PathShadeTypeValueModel.CIRCLE;
    if (value == STPathShadeType.RECT) return PathShadeTypeValueModel.RECT;
    return null;
  }
}
