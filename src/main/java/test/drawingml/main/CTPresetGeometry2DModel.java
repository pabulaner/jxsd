package test.drawingml.main;

public class CTPresetGeometry2DModel {
  private final STShapeTypeModel prst;

  private final CTGeomGuideListModel avLst;

  public CTPresetGeometry2DModel(STShapeTypeModel prst, CTGeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public STShapeTypeModel getPrst() {
    return this.prst;
  }

  public CTGeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
