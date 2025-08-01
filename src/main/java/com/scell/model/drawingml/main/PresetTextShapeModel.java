package com.scell.model.drawingml.main;

public class PresetTextShapeModel {
  private final TextShapeTypeValueModel prst;

  private final GeomGuideListModel avLst;

  public PresetTextShapeModel(TextShapeTypeValueModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public TextShapeTypeValueModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
