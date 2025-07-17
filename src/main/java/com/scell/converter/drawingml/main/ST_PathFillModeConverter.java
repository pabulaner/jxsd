package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PathFillModeModel;
import org.docx4j.dml.STPathFillMode;

public class ST_PathFillModeConverter {
  private ST_PathFillModeConverter() {
  }

  public static ST_PathFillModeModel fromDocx4j(STPathFillMode value) {
    if (value == null) return null;
    if (value == STPathFillMode.NONE) return ST_PathFillModeModel.NONE;
    if (value == STPathFillMode.NORM) return ST_PathFillModeModel.NORM;
    if (value == STPathFillMode.LIGHTEN) return ST_PathFillModeModel.LIGHTEN;
    if (value == STPathFillMode.LIGHTEN_LESS) return ST_PathFillModeModel.LIGHTEN_LESS;
    if (value == STPathFillMode.DARKEN) return ST_PathFillModeModel.DARKEN;
    if (value == STPathFillMode.DARKEN_LESS) return ST_PathFillModeModel.DARKEN_LESS;
    return null;
  }

  public static STPathFillMode toDocx4j(ST_PathFillModeModel value) {
    return null;
  }
}
