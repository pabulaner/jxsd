package test.drawingml.main;

import test.XMLSchema.TokenModel;

public class CTGraphicalObjectDataModel {
  private final TokenModel uri;

  public CTGraphicalObjectDataModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
