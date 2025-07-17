package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.chart.CT_ExtensionModel;

public class CT_ExtensionBuilder {
  private TokenModel uri;

  public CT_ExtensionBuilder() {
  }

  public CT_ExtensionBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public CT_ExtensionModel build() {
    return new CT_ExtensionModel(this.uri);
  }

  public CT_ExtensionBuilder from(CT_ExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }
}
