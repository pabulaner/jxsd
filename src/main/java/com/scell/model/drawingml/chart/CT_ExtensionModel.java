package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.TokenModel;

public class CT_ExtensionModel {
  private final TokenModel uri;

  public CT_ExtensionModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
