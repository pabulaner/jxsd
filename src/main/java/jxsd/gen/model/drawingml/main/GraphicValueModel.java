package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GraphicValueBuilder;

/**
 * This is a generated sequence class.
 */
public class GraphicValueModel {
  private final GraphicDataValueModel graphicData;

  public GraphicValueModel(GraphicDataValueModel graphicData) {
    this.graphicData = graphicData;
  }

  public GraphicValueBuilder builder() {
    return new GraphicValueBuilder().from(this);
  }

  public GraphicDataValueModel getGraphicData() {
    return this.graphicData;
  }
}
