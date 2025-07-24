package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashPropertiesModel;
import com.scell.model.drawingml.main.PresetLineDashValModel;

public class PresetLineDashPropertiesBuilder {
  private PresetLineDashValModel val;

  public PresetLineDashPropertiesBuilder() {
  }

  public PresetLineDashPropertiesBuilder setVal(PresetLineDashValModel val) {
    this.val = val;
    return this;
  }

  public PresetLineDashPropertiesModel build() {
    return new PresetLineDashPropertiesModel(this.val);
  }

  public PresetLineDashPropertiesBuilder from(PresetLineDashPropertiesModel value) {
    this.val = value.getVal();
    return this;
  }
}
