package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AngleModel;
import org.docx4j.dml.CTAngle;

public class AngleConverter {
  private AngleConverter() {
  }

  public static AngleModel fromDocx4J(CTAngle value) {
    if (value == null) return null;
    return new AngleModel(AngleConverter.fromDocx4J(value.getVal()));
  }
}
