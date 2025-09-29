package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ShapeValueBuilder;
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
    if (value == ShapeValueBuilder.CONE) return ShapeValueModel.CONE;
    if (value == ShapeValueBuilder.CONE_TO_MAX) return ShapeValueModel.CONE_TO_MAX;
    if (value == ShapeValueBuilder.BOX) return ShapeValueModel.BOX;
    if (value == ShapeValueBuilder.CYLINDER) return ShapeValueModel.CYLINDER;
    if (value == ShapeValueBuilder.PYRAMID) return ShapeValueModel.PYRAMID;
    if (value == ShapeValueBuilder.PYRAMID_TO_MAX) return ShapeValueModel.PYRAMID_TO_MAX;
    return null;
  }

  public static STShape toDocx4j(ShapeValueModel value) {
    if (value == null) return null;
    if (value == ShapeValueModel.CONE) return ShapeValueBuilder.CONE;
    if (value == ShapeValueModel.CONE_TO_MAX) return ShapeValueBuilder.CONE_TO_MAX;
    if (value == ShapeValueModel.BOX) return ShapeValueBuilder.BOX;
    if (value == ShapeValueModel.CYLINDER) return ShapeValueBuilder.CYLINDER;
    if (value == ShapeValueModel.PYRAMID) return ShapeValueBuilder.PYRAMID;
    if (value == ShapeValueModel.PYRAMID_TO_MAX) return ShapeValueBuilder.PYRAMID_TO_MAX;
    return null;
  }
}
