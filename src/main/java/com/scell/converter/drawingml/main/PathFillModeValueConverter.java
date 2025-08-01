package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PathFillModeValueModel;
import org.docx4j.dml.STPathFillMode;

public class PathFillModeValueConverter {
  private PathFillModeValueConverter() {
  }

  public static PathFillModeValueModel fromDocx4J(STPathFillMode value) {
    if (value == null) return null;
    if (value == STPathFillMode.NONE) return PathFillModeValueModel.NONE;
    if (value == STPathFillMode.NORM) return PathFillModeValueModel.NORM;
    if (value == STPathFillMode.LIGHTEN) return PathFillModeValueModel.LIGHTEN;
    if (value == STPathFillMode.LIGHTEN_LESS) return PathFillModeValueModel.LIGHTEN_LESS;
    if (value == STPathFillMode.DARKEN) return PathFillModeValueModel.DARKEN;
    if (value == STPathFillMode.DARKEN_LESS) return PathFillModeValueModel.DARKEN_LESS;
    return null;
  }
}
