package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_GeomGuideFormulaModel;

public class ST_GeomGuideFormulaConverter {
  private ST_GeomGuideFormulaConverter() {
  }

  public static ST_GeomGuideFormulaModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_GeomGuideFormulaModel(value);
  }

  public static String toDocx4J(ST_GeomGuideFormulaModel value) {
    return null;
  }
}
