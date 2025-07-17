package model.drawingml.main;

import model.XMLSchema.tokenModel;

public class CT_GraphicalObjectDataModel {
  private final tokenModel uri;

  public CT_GraphicalObjectDataModel(tokenModel uri) {
    this.uri = uri;
  }

  public tokenModel getUri() {
    return this.uri;
  }
}
