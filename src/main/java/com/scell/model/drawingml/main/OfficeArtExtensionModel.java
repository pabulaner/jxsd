package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;

public class OfficeArtExtensionModel {
  private final TokenValueModel uri;

  public OfficeArtExtensionModel(TokenValueModel uri) {
    this.uri = uri;
  }

  public TokenValueModel getUri() {
    return this.uri;
  }
}
