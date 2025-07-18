package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideModel;
import com.scell.model.drawingml.main.ST_GeomGuideFormulaModel;
import com.scell.model.drawingml.main.ST_GeomGuideNameModel;

public class CT_GeomGuideBuilder {
  private ST_GeomGuideFormulaModel fmla;

  private ST_GeomGuideNameModel name;

  public CT_GeomGuideBuilder() {
  }

  public CT_GeomGuideBuilder setFmla(ST_GeomGuideFormulaModel fmla) {
    this.fmla = fmla;
    return this;
  }

  public CT_GeomGuideBuilder setName(ST_GeomGuideNameModel name) {
    this.name = name;
    return this;
  }

  public CT_GeomGuideModel build() {
    return new CT_GeomGuideModel(this.fmla, this.name);
  }

  public CT_GeomGuideBuilder from(CT_GeomGuideModel value) {
    this.fmla = value.getFmla();
    this.name = value.getName();
    return this;
  }
}
