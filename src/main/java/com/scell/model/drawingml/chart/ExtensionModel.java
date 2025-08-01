package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.TokenValueModel;

public class ExtensionModel {
  private final TokenValueModel uri;

  public ExtensionModel(TokenValueModel uri) {
    this.uri = uri;
  }

  public TokenValueModel getUri() {
    return this.uri;
  }
}
