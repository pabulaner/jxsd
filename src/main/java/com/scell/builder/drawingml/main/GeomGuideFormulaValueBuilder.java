package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaValueModel;

public class GeomGuideFormulaValueBuilder {
  private String value;

  public GeomGuideFormulaValueBuilder() {
  }

  public GeomGuideFormulaValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GeomGuideFormulaValueBuilder from(GeomGuideFormulaValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GeomGuideFormulaValueModel build() {
    return new GeomGuideFormulaValueModel(this.value);
  }
}
