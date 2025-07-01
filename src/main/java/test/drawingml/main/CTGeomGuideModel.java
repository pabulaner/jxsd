package test.drawingml.main;

public class CTGeomGuideModel {
  private final STGeomGuideFormulaModel fmla;

  private final STGeomGuideNameModel name;

  public CTGeomGuideModel(STGeomGuideFormulaModel fmla, STGeomGuideNameModel name) {
    this.fmla = fmla;
    this.name = name;
  }

  public STGeomGuideFormulaModel getFmla() {
    return this.fmla;
  }

  public STGeomGuideNameModel getName() {
    return this.name;
  }
}
