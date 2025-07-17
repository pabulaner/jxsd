package com.scell.model.drawingml.main;

public class CT_GraphicalObjectModel {
  private final CT_GraphicalObjectDataModel graphicData;

  public CT_GraphicalObjectModel(CT_GraphicalObjectDataModel graphicData) {
    this.graphicData = graphicData;
  }

  public CT_GraphicalObjectDataModel getGraphicData() {
    return this.graphicData;
  }
}
