package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;

public class SolidColorFillPropertiesBuilder {
  private int type;

  private Object value;

  public SolidColorFillPropertiesBuilder() {
    this.type = -1;
    this.value = null;
  }

  public SolidColorFillPropertiesBuilder setScrgbClr(ScRgbColorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesBuilder setSrgbClr(SRgbColorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesBuilder setHslClr(HslColorModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesBuilder setSysClr(SystemColorModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesBuilder setSchemeClr(SchemeColorModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesBuilder setPrstClr(PresetColorModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public SolidColorFillPropertiesModel build() {
    if (this.type == -1) return new SolidColorFillPropertiesModel();
    if (this.type == 0) return SolidColorFillPropertiesModel.newScrgbClr((ScRgbColorModel) this.value);
    if (this.type == 1) return SolidColorFillPropertiesModel.newSrgbClr((SRgbColorModel) this.value);
    if (this.type == 2) return SolidColorFillPropertiesModel.newHslClr((HslColorModel) this.value);
    if (this.type == 3) return SolidColorFillPropertiesModel.newSysClr((SystemColorModel) this.value);
    if (this.type == 4) return SolidColorFillPropertiesModel.newSchemeClr((SchemeColorModel) this.value);
    if (this.type == 5) return SolidColorFillPropertiesModel.newPrstClr((PresetColorModel) this.value);
    return null;
  }

  public SolidColorFillPropertiesBuilder from(SolidColorFillPropertiesModel value) {
    this.type = -1;
    this.value = null;
    if (value.isScrgbClr()) {
      this.type = 0;
      this.value = value.getScrgbClr();
    }
    if (value.isSrgbClr()) {
      this.type = 1;
      this.value = value.getSrgbClr();
    }
    if (value.isHslClr()) {
      this.type = 2;
      this.value = value.getHslClr();
    }
    if (value.isSysClr()) {
      this.type = 3;
      this.value = value.getSysClr();
    }
    if (value.isSchemeClr()) {
      this.type = 4;
      this.value = value.getSchemeClr();
    }
    if (value.isPrstClr()) {
      this.type = 5;
      this.value = value.getPrstClr();
    }
    return this;
  }
}
