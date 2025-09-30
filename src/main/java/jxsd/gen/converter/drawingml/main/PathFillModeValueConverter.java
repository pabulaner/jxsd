package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PathFillModeValueModel;
import org.docx4j.dml.STPathFillMode;

/**
 * This is a generated enum class.
 */
public class PathFillModeValueConverter {
  private PathFillModeValueConverter() {
  }

  public static PathFillModeValueModel fromDocx4j(STPathFillMode value) {
    if (value == null) return null;
    if (value == STPathFillMode.NONE) return PathFillModeValueModel.NONE;
    if (value == STPathFillMode.NORM) return PathFillModeValueModel.NORM;
    if (value == STPathFillMode.LIGHTEN) return PathFillModeValueModel.LIGHTEN;
    if (value == STPathFillMode.LIGHTEN_LESS) return PathFillModeValueModel.LIGHTEN_LESS;
    if (value == STPathFillMode.DARKEN) return PathFillModeValueModel.DARKEN;
    if (value == STPathFillMode.DARKEN_LESS) return PathFillModeValueModel.DARKEN_LESS;
    return null;
  }

  public static STPathFillMode toDocx4j(PathFillModeValueModel value) {
    if (value == null) return null;
    if (value == PathFillModeValueModel.NONE) return STPathFillMode.NONE;
    if (value == PathFillModeValueModel.NORM) return STPathFillMode.NORM;
    if (value == PathFillModeValueModel.LIGHTEN) return STPathFillMode.LIGHTEN;
    if (value == PathFillModeValueModel.LIGHTEN_LESS) return STPathFillMode.LIGHTEN_LESS;
    if (value == PathFillModeValueModel.DARKEN) return STPathFillMode.DARKEN;
    if (value == PathFillModeValueModel.DARKEN_LESS) return STPathFillMode.DARKEN_LESS;
    return null;
  }
}
