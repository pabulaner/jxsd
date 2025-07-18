package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_GeomGuideFormulaModel;

public class ST_GeomGuideFormulaBuilder {
  private String value;

  public ST_GeomGuideFormulaBuilder() {
    this.value = null;
  }

  public ST_GeomGuideFormulaBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_GeomGuideFormulaBuilder from(ST_GeomGuideFormulaModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_GeomGuideFormulaModel build() {
    return new ST_GeomGuideFormulaModel(this.value);
  }
}
