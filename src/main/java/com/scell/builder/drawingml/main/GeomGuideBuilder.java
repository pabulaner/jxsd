package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaModel;
import com.scell.model.drawingml.main.GeomGuideModel;
import com.scell.model.drawingml.main.GeomGuideNameModel;

public class GeomGuideBuilder {
  private GeomGuideFormulaModel fmla;

  private GeomGuideNameModel name;

  public GeomGuideBuilder() {
  }

  public GeomGuideBuilder setFmla(GeomGuideFormulaModel fmla) {
    this.fmla = fmla;
    return this;
  }

  public GeomGuideBuilder setName(GeomGuideNameModel name) {
    this.name = name;
    return this;
  }

  public GeomGuideModel build() {
    return new GeomGuideModel(this.fmla, this.name);
  }

  public GeomGuideBuilder from(GeomGuideModel value) {
    this.fmla = value.getFmla();
    this.name = value.getName();
    return this;
  }
}
