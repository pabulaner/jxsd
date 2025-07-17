package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;

public class CT_GroupFillPropertiesBuilder {
  public CT_GroupFillPropertiesBuilder() {
  }

  public CT_GroupFillPropertiesModel build() {
    return new CT_GroupFillPropertiesModel();
  }

  public CT_GroupFillPropertiesBuilder from(CT_GroupFillPropertiesModel value) {
    return this;
  }
}
