package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import org.docx4j.dml.CTPositiveFixedAngle;

public class PositiveFixedAngleConverter {
  private PositiveFixedAngleConverter() {
  }

  public static PositiveFixedAngleModel fromDocx4J(CTPositiveFixedAngle value) {
    if (value == null) return null;
    return new PositiveFixedAngleModel(PositiveFixedAngleValueConverter.fromDocx4J(value.getVal()));
  }
}
