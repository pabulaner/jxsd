package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetLineDashPropertiesModel;
import com.scell.model.drawingml.main.ST_PresetLineDashValModel;

public class CT_PresetLineDashPropertiesBuilder {
  private ST_PresetLineDashValModel val;

  public CT_PresetLineDashPropertiesBuilder() {
  }

  public CT_PresetLineDashPropertiesBuilder setVal(ST_PresetLineDashValModel val) {
    this.val = val;
    return this;
  }

  public CT_PresetLineDashPropertiesModel build() {
    return new CT_PresetLineDashPropertiesModel(this.val);
  }

  public CT_PresetLineDashPropertiesBuilder from(CT_PresetLineDashPropertiesModel value) {
    this.val = value.getVal();
    return this;
  }
}
