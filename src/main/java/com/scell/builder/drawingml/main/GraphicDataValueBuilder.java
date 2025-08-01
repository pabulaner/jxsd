package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;
import com.scell.model.drawingml.main.GraphicDataValueModel;

public class GraphicDataValueBuilder {
  private TokenValueModel uri;

  public GraphicDataValueBuilder() {
  }

  public GraphicDataValueBuilder setUri(TokenValueModel uri) {
    this.uri = uri;
    return this;
  }

  public GraphicDataValueModel build() {
    return new GraphicDataValueModel(this.uri);
  }

  public GraphicDataValueBuilder from(GraphicDataValueModel value) {
    this.uri = value.getUri();
    return this;
  }
}
