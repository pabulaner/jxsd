package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PathFillModeModel;
import org.docx4j.dml.STPathFillMode;

public class PathFillModeConverter {
  private PathFillModeConverter() {
  }

  public static PathFillModeModel fromDocx4J(STPathFillMode value) {
    if (value == null) return null;
    if (value == STPathFillMode.NONE) return PathFillModeModel.NONE;
    if (value == STPathFillMode.NORM) return PathFillModeModel.NORM;
    if (value == STPathFillMode.LIGHTEN) return PathFillModeModel.LIGHTEN;
    if (value == STPathFillMode.LIGHTEN_LESS) return PathFillModeModel.LIGHTEN_LESS;
    if (value == STPathFillMode.DARKEN) return PathFillModeModel.DARKEN;
    if (value == STPathFillMode.DARKEN_LESS) return PathFillModeModel.DARKEN_LESS;
    return null;
  }
}
