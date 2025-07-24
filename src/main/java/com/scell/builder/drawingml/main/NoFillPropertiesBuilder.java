package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.NoFillPropertiesModel;

public class NoFillPropertiesBuilder {
  public NoFillPropertiesBuilder() {
  }

  public NoFillPropertiesModel build() {
    return new NoFillPropertiesModel();
  }

  public NoFillPropertiesBuilder from(NoFillPropertiesModel value) {
    return this;
  }
}
