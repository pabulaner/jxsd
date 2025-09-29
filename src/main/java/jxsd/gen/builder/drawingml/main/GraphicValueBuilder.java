package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GraphicDataValueModel;
import jxsd.gen.model.drawingml.main.GraphicValueModel;

/**
 * This is a generated sequence class.
 */
public class GraphicValueBuilder {
  private GraphicDataValueModel graphicData;

  public GraphicValueBuilder() {
  }

  public GraphicValueBuilder setGraphicData(GraphicDataValueModel graphicData) {
    this.graphicData = graphicData;
    return this;
  }

  public GraphicValueBuilder from(GraphicValueModel value) {
    this.graphicData = value.getGraphicData();
    return this;
  }

  public GraphicValueModel build() {
    return new GraphicValueModel(this.graphicData);
  }
}
