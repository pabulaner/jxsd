package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.CT_GraphicalObjectDataModel;

public class CT_GraphicalObjectDataBuilder {
  private TokenModel uri;

  public CT_GraphicalObjectDataBuilder() {
  }

  public CT_GraphicalObjectDataBuilder setUri(TokenModel uri) {
    this.uri = uri;
    return this;
  }

  public CT_GraphicalObjectDataModel build() {
    return new CT_GraphicalObjectDataModel(this.uri);
  }

  public CT_GraphicalObjectDataBuilder from(CT_GraphicalObjectDataModel value) {
    this.uri = value.getUri();
    return this;
  }
}
