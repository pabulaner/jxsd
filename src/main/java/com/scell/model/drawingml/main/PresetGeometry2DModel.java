package com.scell.model.drawingml.main;

public class PresetGeometry2DModel {
  private final ShapeTypeValueModel prst;

  private final GeomGuideListModel avLst;

  public PresetGeometry2DModel(ShapeTypeValueModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public ShapeTypeValueModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
