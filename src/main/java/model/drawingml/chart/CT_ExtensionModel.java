package model.drawingml.chart;

import model.XMLSchema.tokenModel;

public class CT_ExtensionModel {
  private final tokenModel uri;

  public CT_ExtensionModel(tokenModel uri) {
    this.uri = uri;
  }

  public tokenModel getUri() {
    return this.uri;
  }
}
