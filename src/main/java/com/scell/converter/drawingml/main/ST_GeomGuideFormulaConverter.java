package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_GeomGuideFormulaModel;

public class ST_GeomGuideFormulaConverter {
  private ST_GeomGuideFormulaConverter() {
  }

  public static ST_GeomGuideFormulaModel fromDocx4j(String value) {
    if (value == null) return null;
    return new ST_GeomGuideFormulaModel(value);
  }

  public static String toDocx4j(ST_GeomGuideFormulaModel value) {
    return null;
  }
}
