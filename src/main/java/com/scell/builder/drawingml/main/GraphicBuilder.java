package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GraphicDataModel;
import com.scell.model.drawingml.main.GraphicModel;

public class GraphicBuilder {
  private GraphicDataModel graphicData;

  public GraphicBuilder() {
  }

  public GraphicBuilder setGraphicData(GraphicDataModel graphicData) {
    this.graphicData = graphicData;
    return this;
  }

  public GraphicModel build() {
    return new GraphicModel(this.graphicData);
  }

  public GraphicBuilder from(GraphicModel value) {
    this.graphicData = value.getGraphicData();
    return this;
  }
}
