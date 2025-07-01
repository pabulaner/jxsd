package test.drawingml.main;

public class CTPresetTextShapeModel {
  private final STTextShapeTypeModel prst;

  private final CTGeomGuideListModel avLst;

  public CTPresetTextShapeModel(STTextShapeTypeModel prst, CTGeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public STTextShapeTypeModel getPrst() {
    return this.prst;
  }

  public CTGeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
