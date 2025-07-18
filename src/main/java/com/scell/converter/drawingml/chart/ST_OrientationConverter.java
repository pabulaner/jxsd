package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OrientationModel;
import org.docx4j.dml.chart.STOrientation;

public class ST_OrientationConverter {
  private ST_OrientationConverter() {
  }

  public static ST_OrientationModel fromDocx4J(STOrientation value) {
    if (value == null) return null;
    if (value == STOrientation.MAX_MIN) return ST_OrientationModel.MAX_MIN;
    if (value == STOrientation.MIN_MAX) return ST_OrientationModel.MIN_MAX;
    return null;
  }

  public static STOrientation toDocx4J(ST_OrientationModel value) {
    return null;
  }
}
