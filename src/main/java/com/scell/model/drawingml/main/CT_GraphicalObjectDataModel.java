package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;

public class CT_GraphicalObjectDataModel {
  private final TokenModel uri;

  public CT_GraphicalObjectDataModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
