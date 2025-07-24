package com.scell.model.drawingml.main;

public class PresetTextShapeModel {
  private final TextShapeTypeModel prst;

  private final GeomGuideListModel avLst;

  public PresetTextShapeModel(TextShapeTypeModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public TextShapeTypeModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
