package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveFixedAngleModel;
import org.docx4j.dml.CTPositiveFixedAngle;

public class CT_PositiveFixedAngleConverter {
  private CT_PositiveFixedAngleConverter() {
  }

  public static CT_PositiveFixedAngleModel fromDocx4J(CTPositiveFixedAngle value) {
    if (value == null) return null;
    return new CT_PositiveFixedAngleModel(ST_PositiveFixedAngleConverter.fromDocx4J(value.getVal()));
  }

  public static CTPositiveFixedAngle toDocx4J(CT_PositiveFixedAngleModel value) {
    return null;
  }
}
