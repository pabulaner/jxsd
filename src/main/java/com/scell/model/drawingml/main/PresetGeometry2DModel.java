package com.scell.model.drawingml.main;

public class PresetGeometry2DModel {
  private final ShapeTypeModel prst;

  private final GeomGuideListModel avLst;

  public PresetGeometry2DModel(ShapeTypeModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public ShapeTypeModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
