package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaModel;

public class GeomGuideFormulaBuilder {
  private String value;

  public GeomGuideFormulaBuilder() {
  }

  public GeomGuideFormulaBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GeomGuideFormulaBuilder from(GeomGuideFormulaModel value) {
    this.value = value.getValue();
    return this;
  }

  public GeomGuideFormulaModel build() {
    return new GeomGuideFormulaModel(this.value);
  }
}
