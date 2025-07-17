package model.drawingml.main;

import model.XMLSchema.tokenModel;

public class CT_OfficeArtExtensionModel {
  private final tokenModel uri;

  public CT_OfficeArtExtensionModel(tokenModel uri) {
    this.uri = uri;
  }

  public tokenModel getUri() {
    return this.uri;
  }
}
