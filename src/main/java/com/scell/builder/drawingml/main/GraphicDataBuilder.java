package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.GraphicDataModel;

public class GraphicDataBuilder {
  private TokenModel uri;

  public GraphicDataBuilder() {
  }

  public GraphicDataBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public GraphicDataModel build() {
    return new GraphicDataModel(this.uri);
  }

  public GraphicDataBuilder from(GraphicDataModel value) {
    this.uri = value.getUri();
    return this;
  }
}
