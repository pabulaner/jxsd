package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GraphicDataValueBuilder;

/**
 * This is a generated sequence class.
 */
public class GraphicDataValueModel {
  private final String uri;

  public GraphicDataValueModel(String uri) {
    this.uri = uri;
  }

  public GraphicDataValueBuilder builder() {
    return new GraphicDataValueBuilder().from(this);
  }

  public String getUri() {
    return this.uri;
  }
}
