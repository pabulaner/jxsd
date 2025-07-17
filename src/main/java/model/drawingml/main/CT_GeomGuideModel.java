package model.drawingml.main;

public class CT_GeomGuideModel {
  private final ST_GeomGuideFormulaModel fmla;

  private final ST_GeomGuideNameModel name;

  public CT_GeomGuideModel(ST_GeomGuideFormulaModel fmla, ST_GeomGuideNameModel name) {
    this.fmla = fmla;
    this.name = name;
  }

  public ST_GeomGuideFormulaModel getFmla() {
    return this.fmla;
  }

  public ST_GeomGuideNameModel getName() {
    return this.name;
  }
}
