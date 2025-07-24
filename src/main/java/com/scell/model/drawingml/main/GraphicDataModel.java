package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;

public class GraphicDataModel {
  private final TokenModel uri;

  public GraphicDataModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
