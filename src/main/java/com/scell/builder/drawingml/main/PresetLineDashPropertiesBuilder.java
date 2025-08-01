package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashPropertiesModel;
import com.scell.model.drawingml.main.PresetLineDashValValueModel;

public class PresetLineDashPropertiesBuilder {
  private PresetLineDashValValueModel val;

  public PresetLineDashPropertiesBuilder() {
  }

  public PresetLineDashPropertiesBuilder setVal(PresetLineDashValValueModel val) {
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
