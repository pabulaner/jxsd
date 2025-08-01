package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OrientationValueModel;
import org.docx4j.dml.chart.STOrientation;

public class OrientationValueConverter {
  private OrientationValueConverter() {
  }

  public static OrientationValueModel fromDocx4J(STOrientation value) {
    if (value == null) return null;
    if (value == STOrientation.MAX_MIN) return OrientationValueModel.MAX_MIN;
    if (value == STOrientation.MIN_MAX) return OrientationValueModel.MIN_MAX;
    return null;
  }
}
