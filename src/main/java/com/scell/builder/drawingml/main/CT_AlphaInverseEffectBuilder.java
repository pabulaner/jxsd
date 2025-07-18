package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaInverseEffectModel;
import com.scell.model.drawingml.main.CT_HslColorModel;
import com.scell.model.drawingml.main.CT_PresetColorModel;
import com.scell.model.drawingml.main.CT_SRgbColorModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.CT_SchemeColorModel;
import com.scell.model.drawingml.main.CT_SystemColorModel;
import java.lang.Object;

public class CT_AlphaInverseEffectBuilder {
  private int type;

  private Object value;

  public CT_AlphaInverseEffectBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_AlphaInverseEffectBuilder setScrgbClr(CT_ScRgbColorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectBuilder setSrgbClr(CT_SRgbColorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectBuilder setHslClr(CT_HslColorModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectBuilder setSysClr(CT_SystemColorModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectBuilder setSchemeClr(CT_SchemeColorModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectBuilder setPrstClr(CT_PresetColorModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public CT_AlphaInverseEffectModel build() {
    if (this.type == -1) return new CT_AlphaInverseEffectModel();
    if (this.type == 0) return CT_AlphaInverseEffectModel.newScrgbClr((CT_ScRgbColorModel) this.value);
    if (this.type == 1) return CT_AlphaInverseEffectModel.newSrgbClr((CT_SRgbColorModel) this.value);
    if (this.type == 2) return CT_AlphaInverseEffectModel.newHslClr((CT_HslColorModel) this.value);
    if (this.type == 3) return CT_AlphaInverseEffectModel.newSysClr((CT_SystemColorModel) this.value);
    if (this.type == 4) return CT_AlphaInverseEffectModel.newSchemeClr((CT_SchemeColorModel) this.value);
    if (this.type == 5) return CT_AlphaInverseEffectModel.newPrstClr((CT_PresetColorModel) this.value);
    return null;
  }

  public CT_AlphaInverseEffectBuilder from(CT_AlphaInverseEffectModel value) {
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
