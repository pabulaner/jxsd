package com.scell.model.drawingml.main;

public class GeomGuideModel {
  private final GeomGuideFormulaModel fmla;

  private final GeomGuideNameModel name;

  public GeomGuideModel(GeomGuideFormulaModel fmla, GeomGuideNameModel name) {
    this.fmla = fmla;
    this.name = name;
  }

  public GeomGuideFormulaModel getFmla() {
    return this.fmla;
  }

  public GeomGuideNameModel getName() {
    return this.name;
  }
}
