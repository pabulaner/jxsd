package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.OfficeArtExtensionModel;

public class OfficeArtExtensionBuilder {
  private TokenModel uri;

  public OfficeArtExtensionBuilder() {
  }

  public OfficeArtExtensionBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public OfficeArtExtensionModel build() {
    return new OfficeArtExtensionModel(this.uri);
  }

  public OfficeArtExtensionBuilder from(OfficeArtExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }
}
