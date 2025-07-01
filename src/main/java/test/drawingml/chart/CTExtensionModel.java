package test.drawingml.chart;

import test.XMLSchema.TokenModel;

public class CTExtensionModel {
  private final TokenModel uri;

  public CTExtensionModel(TokenModel uri) {
    this.uri = uri;
  }

  public TokenModel getUri() {
    return this.uri;
  }
}
