package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PathShadeTypeValueBuilder;
import jxsd.gen.model.drawingml.main.PathShadeTypeValueModel;
import org.docx4j.dml.STPathShadeType;

/**
 * This is a generated enum class.
 */
public class PathShadeTypeValueConverter {
  private PathShadeTypeValueConverter() {
  }

  public static PathShadeTypeValueModel fromDocx4j(STPathShadeType value) {
    if (value == null) return null;
    if (value == PathShadeTypeValueBuilder.SHAPE) return PathShadeTypeValueModel.SHAPE;
    if (value == PathShadeTypeValueBuilder.CIRCLE) return PathShadeTypeValueModel.CIRCLE;
    if (value == PathShadeTypeValueBuilder.RECT) return PathShadeTypeValueModel.RECT;
    return null;
  }

  public static STPathShadeType toDocx4j(PathShadeTypeValueModel value) {
    if (value == null) return null;
    if (value == PathShadeTypeValueModel.SHAPE) return PathShadeTypeValueBuilder.SHAPE;
    if (value == PathShadeTypeValueModel.CIRCLE) return PathShadeTypeValueBuilder.CIRCLE;
    if (value == PathShadeTypeValueModel.RECT) return PathShadeTypeValueBuilder.RECT;
    return null;
  }
}
