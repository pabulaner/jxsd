package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;

public class OfficeArtExtensionModel {
  private final TokenModel uri;

  public OfficeArtExtensionModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
