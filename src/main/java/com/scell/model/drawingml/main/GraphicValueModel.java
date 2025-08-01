package com.scell.model.drawingml.main;

public class GraphicValueModel {
  private final GraphicDataValueModel graphicData;

  public GraphicValueModel(GraphicDataValueModel graphicData) {
    this.graphicData = graphicData;
  }

  public GraphicDataValueModel getGraphicData() {
    return this.graphicData;
  }
}
