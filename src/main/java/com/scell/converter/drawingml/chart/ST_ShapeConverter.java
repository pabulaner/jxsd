package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ShapeModel;
import org.docx4j.dml.chart.STShape;

public class ST_ShapeConverter {
  private ST_ShapeConverter() {
  }

  public static ST_ShapeModel fromDocx4J(STShape value) {
    if (value == null) return null;
    if (value == STShape.CONE) return ST_ShapeModel.CONE;
    if (value == STShape.CONE_TO_MAX) return ST_ShapeModel.CONE_TO_MAX;
    if (value == STShape.BOX) return ST_ShapeModel.BOX;
    if (value == STShape.CYLINDER) return ST_ShapeModel.CYLINDER;
    if (value == STShape.PYRAMID) return ST_ShapeModel.PYRAMID;
    if (value == STShape.PYRAMID_TO_MAX) return ST_ShapeModel.PYRAMID_TO_MAX;
    return null;
  }

  public static STShape toDocx4J(ST_ShapeModel value) {
    return null;
  }
}
