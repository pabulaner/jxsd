package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingModel;
import com.scell.model.drawingml.main.CT_ColorSchemeAndMappingModel;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;

public class CT_ColorSchemeAndMappingBuilder {
  private CT_ColorSchemeModel clrScheme;

  private CT_ColorMappingModel clrMap;

  public CT_ColorSchemeAndMappingBuilder() {
  }

  public CT_ColorSchemeAndMappingBuilder setClrScheme(CT_ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public CT_ColorSchemeAndMappingBuilder setClrMap(CT_ColorMappingModel clrMap) {
    this.clrMap = clrMap;
    return this;
  }

  public CT_ColorSchemeAndMappingModel build() {
    return new CT_ColorSchemeAndMappingModel(this.clrScheme, this.clrMap);
  }

  public CT_ColorSchemeAndMappingBuilder from(CT_ColorSchemeAndMappingModel value) {
    this.clrScheme = value.getClrScheme();
    this.clrMap = value.getClrMap();
    return this;
  }
}
