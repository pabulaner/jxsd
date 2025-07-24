package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.chart.ExtensionModel;

public class ExtensionBuilder {
  private TokenModel uri;

  public ExtensionBuilder() {
  }

  public ExtensionBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public ExtensionModel build() {
    return new ExtensionModel(this.uri);
  }

  public ExtensionBuilder from(ExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }
}
