package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaModel;

public class GeomGuideFormulaConverter {
  private GeomGuideFormulaConverter() {
  }

  public static GeomGuideFormulaModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GeomGuideFormulaModel(value);
  }
}
