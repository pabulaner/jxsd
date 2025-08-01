package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideFormulaValueModel;
import com.scell.model.drawingml.main.GeomGuideModel;
import com.scell.model.drawingml.main.GeomGuideNameValueModel;

public class GeomGuideBuilder {
  private GeomGuideFormulaValueModel fmla;

  private GeomGuideNameValueModel name;

  public GeomGuideBuilder() {
  }

  public GeomGuideBuilder setFmla(GeomGuideFormulaValueModel fmla) {
    this.fmla = fmla;
    return this;
  }

  public GeomGuideBuilder setName(GeomGuideNameValueModel name) {
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
