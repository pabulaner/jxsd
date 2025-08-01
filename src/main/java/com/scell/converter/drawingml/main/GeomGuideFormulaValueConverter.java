package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaValueModel;

public class GeomGuideFormulaValueConverter {
  private GeomGuideFormulaValueConverter() {
  }

  public static GeomGuideFormulaValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GeomGuideFormulaValueModel(value);
  }
}
