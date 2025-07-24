package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaInverseEffectModel;
import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;

public class AlphaInverseEffectBuilder {
  private int type;

  private Object value;

  public AlphaInverseEffectBuilder() {
    this.type = -1;
    this.value = null;
  }

  public AlphaInverseEffectBuilder setScrgbClr(ScRgbColorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectBuilder setSrgbClr(SRgbColorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectBuilder setHslClr(HslColorModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectBuilder setSysClr(SystemColorModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectBuilder setSchemeClr(SchemeColorModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectBuilder setPrstClr(PresetColorModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public AlphaInverseEffectModel build() {
    if (this.type == -1) return new AlphaInverseEffectModel();
    if (this.type == 0) return AlphaInverseEffectModel.newScrgbClr((ScRgbColorModel) this.value);
    if (this.type == 1) return AlphaInverseEffectModel.newSrgbClr((SRgbColorModel) this.value);
    if (this.type == 2) return AlphaInverseEffectModel.newHslClr((HslColorModel) this.value);
    if (this.type == 3) return AlphaInverseEffectModel.newSysClr((SystemColorModel) this.value);
    if (this.type == 4) return AlphaInverseEffectModel.newSchemeClr((SchemeColorModel) this.value);
    if (this.type == 5) return AlphaInverseEffectModel.newPrstClr((PresetColorModel) this.value);
    return null;
  }

  public AlphaInverseEffectBuilder from(AlphaInverseEffectModel value) {
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
