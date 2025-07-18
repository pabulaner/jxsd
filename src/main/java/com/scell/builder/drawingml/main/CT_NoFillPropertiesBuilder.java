package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;

public class CT_NoFillPropertiesBuilder {
  public CT_NoFillPropertiesBuilder() {
  }

  public CT_NoFillPropertiesModel build() {
    return new CT_NoFillPropertiesModel();
  }

  public CT_NoFillPropertiesBuilder from(CT_NoFillPropertiesModel value) {
    return this;
  }
}
