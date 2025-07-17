package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OrientationModel;
import org.docx4j.dml.chart.CTOrientation;

public class CT_OrientationConverter {
  private CT_OrientationConverter() {
  }

  public static CT_OrientationModel fromDocx4j(CTOrientation value) {
    if (value == null) return null;
    return new CT_OrientationModel(ST_OrientationConverter.fromDocx4j(value.getVal()));
  }

  public static CTOrientation toDocx4j(CT_OrientationModel value) {
    return null;
  }
}
