package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GraphicDataValueModel;

/**
 * This is a generated sequence class.
 */
public class GraphicDataValueBuilder {
  private String uri;

  public GraphicDataValueBuilder() {
  }

  public GraphicDataValueBuilder setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public GraphicDataValueBuilder from(GraphicDataValueModel value) {
    this.uri = value.getUri();
    return this;
  }

  public GraphicDataValueModel build() {
    return new GraphicDataValueModel(this.uri);
  }
}
