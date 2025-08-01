package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;

public class GraphicDataValueModel {
  private final TokenValueModel uri;

  public GraphicDataValueModel(TokenValueModel uri) {
    this.uri = uri;
  }

  public TokenValueModel getUri() {
    return this.uri;
  }
}
