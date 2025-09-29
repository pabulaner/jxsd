package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PathFillModeValueBuilder;
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
    if (value == PathFillModeValueBuilder.NONE) return PathFillModeValueModel.NONE;
    if (value == PathFillModeValueBuilder.NORM) return PathFillModeValueModel.NORM;
    if (value == PathFillModeValueBuilder.LIGHTEN) return PathFillModeValueModel.LIGHTEN;
    if (value == PathFillModeValueBuilder.LIGHTEN_LESS) return PathFillModeValueModel.LIGHTEN_LESS;
    if (value == PathFillModeValueBuilder.DARKEN) return PathFillModeValueModel.DARKEN;
    if (value == PathFillModeValueBuilder.DARKEN_LESS) return PathFillModeValueModel.DARKEN_LESS;
    return null;
  }

  public static STPathFillMode toDocx4j(PathFillModeValueModel value) {
    if (value == null) return null;
    if (value == PathFillModeValueModel.NONE) return PathFillModeValueBuilder.NONE;
    if (value == PathFillModeValueModel.NORM) return PathFillModeValueBuilder.NORM;
    if (value == PathFillModeValueModel.LIGHTEN) return PathFillModeValueBuilder.LIGHTEN;
    if (value == PathFillModeValueModel.LIGHTEN_LESS) return PathFillModeValueBuilder.LIGHTEN_LESS;
    if (value == PathFillModeValueModel.DARKEN) return PathFillModeValueBuilder.DARKEN;
    if (value == PathFillModeValueModel.DARKEN_LESS) return PathFillModeValueBuilder.DARKEN_LESS;
    return null;
  }
}
