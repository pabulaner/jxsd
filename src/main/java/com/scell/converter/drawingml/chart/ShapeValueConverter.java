package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ShapeValueModel;
import org.docx4j.dml.chart.STShape;

public class ShapeValueConverter {
  private ShapeValueConverter() {
  }

  public static ShapeValueModel fromDocx4J(STShape value) {
    if (value == null) return null;
    if (value == STShape.CONE) return ShapeValueModel.CONE;
    if (value == STShape.CONE_TO_MAX) return ShapeValueModel.CONE_TO_MAX;
    if (value == STShape.BOX) return ShapeValueModel.BOX;
    if (value == STShape.CYLINDER) return ShapeValueModel.CYLINDER;
    if (value == STShape.PYRAMID) return ShapeValueModel.PYRAMID;
    if (value == STShape.PYRAMID_TO_MAX) return ShapeValueModel.PYRAMID_TO_MAX;
    return null;
  }
}
