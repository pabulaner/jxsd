package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ShapeValueModel;
import org.docx4j.dml.chart.STShape;

/**
 * This is a generated enum class.
 */
public class ShapeValueConverter {
  private ShapeValueConverter() {
  }

  public static ShapeValueModel fromDocx4j(STShape value) {
    if (value == null) return null;
    if (value == STShape.CONE) return ShapeValueModel.CONE;
    if (value == STShape.CONE_TO_MAX) return ShapeValueModel.CONE_TO_MAX;
    if (value == STShape.BOX) return ShapeValueModel.BOX;
    if (value == STShape.CYLINDER) return ShapeValueModel.CYLINDER;
    if (value == STShape.PYRAMID) return ShapeValueModel.PYRAMID;
    if (value == STShape.PYRAMID_TO_MAX) return ShapeValueModel.PYRAMID_TO_MAX;
    return null;
  }

  public static STShape toDocx4j(ShapeValueModel value) {
    if (value == null) return null;
    if (value == ShapeValueModel.CONE) return STShape.CONE;
    if (value == ShapeValueModel.CONE_TO_MAX) return STShape.CONE_TO_MAX;
    if (value == ShapeValueModel.BOX) return STShape.BOX;
    if (value == ShapeValueModel.CYLINDER) return STShape.CYLINDER;
    if (value == ShapeValueModel.PYRAMID) return STShape.PYRAMID;
    if (value == ShapeValueModel.PYRAMID_TO_MAX) return STShape.PYRAMID_TO_MAX;
    return null;
  }
}
