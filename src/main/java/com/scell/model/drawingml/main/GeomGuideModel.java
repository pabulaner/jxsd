package com.scell.model.drawingml.main;

public class GeomGuideModel {
  private final GeomGuideFormulaValueModel fmla;

  private final GeomGuideNameValueModel name;

  public GeomGuideModel(GeomGuideFormulaValueModel fmla, GeomGuideNameValueModel name) {
    this.fmla = fmla;
    this.name = name;
  }

  public GeomGuideFormulaValueModel getFmla() {
    return this.fmla;
  }

  public GeomGuideNameValueModel getName() {
    return this.name;
  }
}
