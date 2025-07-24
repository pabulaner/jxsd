package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OrientationModel;
import org.docx4j.dml.chart.CTOrientation;

public class OrientationConverter {
  private OrientationConverter() {
  }

  public static OrientationModel fromDocx4J(CTOrientation value) {
    if (value == null) return null;
    return new OrientationModel(OrientationConverter.fromDocx4J(value.getVal()));
  }
}
