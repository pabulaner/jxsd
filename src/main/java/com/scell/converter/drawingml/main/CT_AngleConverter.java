package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AngleModel;
import org.docx4j.dml.CTAngle;

public class CT_AngleConverter {
  private CT_AngleConverter() {
  }

  public static CT_AngleModel fromDocx4J(CTAngle value) {
    if (value == null) return null;
    return new CT_AngleModel(ST_AngleConverter.fromDocx4J(value.getVal()));
  }

  public static CTAngle toDocx4J(CT_AngleModel value) {
    return null;
  }
}
