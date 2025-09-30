package jxsd.gen.converter.drawingml.main;

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
    if (value == STPathShadeType.SHAPE) return PathShadeTypeValueModel.SHAPE;
    if (value == STPathShadeType.CIRCLE) return PathShadeTypeValueModel.CIRCLE;
    if (value == STPathShadeType.RECT) return PathShadeTypeValueModel.RECT;
    return null;
  }

  public static STPathShadeType toDocx4j(PathShadeTypeValueModel value) {
    if (value == null) return null;
    if (value == PathShadeTypeValueModel.SHAPE) return STPathShadeType.SHAPE;
    if (value == PathShadeTypeValueModel.CIRCLE) return STPathShadeType.CIRCLE;
    if (value == PathShadeTypeValueModel.RECT) return STPathShadeType.RECT;
    return null;
  }
}
