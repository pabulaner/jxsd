package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ShapeModel;
import org.docx4j.dml.chart.CTShape;

public class CT_ShapeConverter {
  private CT_ShapeConverter() {
  }

  public static CT_ShapeModel fromDocx4j(CTShape value) {
    if (value == null) return null;
    return new CT_ShapeModel(ST_ShapeConverter.fromDocx4j(value.getVal()));
  }

  public static CTShape toDocx4j(CT_ShapeModel value) {
    return null;
  }
}
