package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ShapeModel;
import org.docx4j.dml.chart.CTShape;

public class ShapeConverter {
  private ShapeConverter() {
  }

  public static ShapeModel fromDocx4J(CTShape value) {
    if (value == null) return null;
    return new ShapeModel(ShapeConverter.fromDocx4J(value.getVal()));
  }
}
