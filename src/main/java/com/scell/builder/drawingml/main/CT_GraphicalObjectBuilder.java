package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GraphicalObjectDataModel;
import com.scell.model.drawingml.main.CT_GraphicalObjectModel;

public class CT_GraphicalObjectBuilder {
  private CT_GraphicalObjectDataModel graphicData;

  public CT_GraphicalObjectBuilder() {
  }

  public CT_GraphicalObjectBuilder setGraphicData(CT_GraphicalObjectDataModel graphicData) {
    this.graphicData = graphicData;
    return this;
  }

  public CT_GraphicalObjectModel build() {
    return new CT_GraphicalObjectModel(this.graphicData);
  }

  public CT_GraphicalObjectBuilder from(CT_GraphicalObjectModel value) {
    this.graphicData = value.getGraphicData();
    return this;
  }
}
