package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AngleModel;
import org.docx4j.dml.CTAngle;

public class CT_AngleConverter {
  private CT_AngleConverter() {
  }

  public static CT_AngleModel fromDocx4j(CTAngle value) {
    if (value == null) return null;
    return new CT_AngleModel(ST_AngleConverter.fromDocx4j(value.getVal()));
  }

  public static CTAngle toDocx4j(CT_AngleModel value) {
    return null;
  }
}
