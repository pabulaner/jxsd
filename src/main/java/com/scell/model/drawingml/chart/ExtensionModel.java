package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.TokenModel;

public class ExtensionModel {
  private final TokenModel uri;

  public ExtensionModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
