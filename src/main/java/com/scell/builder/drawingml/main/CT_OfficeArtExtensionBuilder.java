package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionModel;

public class CT_OfficeArtExtensionBuilder {
  private TokenModel uri;

  public CT_OfficeArtExtensionBuilder() {
  }

  public CT_OfficeArtExtensionBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public CT_OfficeArtExtensionModel build() {
    return new CT_OfficeArtExtensionModel(this.uri);
  }

  public CT_OfficeArtExtensionBuilder from(CT_OfficeArtExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }
}
