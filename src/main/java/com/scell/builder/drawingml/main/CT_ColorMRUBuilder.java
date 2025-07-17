package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMRUModel;
import com.scell.model.drawingml.main.CT_HslColorModel;
import com.scell.model.drawingml.main.CT_PresetColorModel;
import com.scell.model.drawingml.main.CT_SRgbColorModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.CT_SchemeColorModel;
import com.scell.model.drawingml.main.CT_SystemColorModel;
import java.lang.Object;

public class CT_ColorMRUBuilder {
  private int type;

  private Object value;

  public CT_ColorMRUBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_ColorMRUBuilder setScrgbClr(CT_ScRgbColorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_ColorMRUBuilder setSrgbClr(CT_SRgbColorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_ColorMRUBuilder setHslClr(CT_HslColorModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public CT_ColorMRUBuilder setSysClr(CT_SystemColorModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public CT_ColorMRUBuilder setSchemeClr(CT_SchemeColorModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public CT_ColorMRUBuilder setPrstClr(CT_PresetColorModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public CT_ColorMRUModel build() {
    if (this.type == -1) return new CT_ColorMRUModel();
    if (this.type == 0) return CT_ColorMRUModel.newScrgbClr((CT_ScRgbColorModel) this.value);
    if (this.type == 1) return CT_ColorMRUModel.newSrgbClr((CT_SRgbColorModel) this.value);
    if (this.type == 2) return CT_ColorMRUModel.newHslClr((CT_HslColorModel) this.value);
    if (this.type == 3) return CT_ColorMRUModel.newSysClr((CT_SystemColorModel) this.value);
    if (this.type == 4) return CT_ColorMRUModel.newSchemeClr((CT_SchemeColorModel) this.value);
    if (this.type == 5) return CT_ColorMRUModel.newPrstClr((CT_PresetColorModel) this.value);
    return null;
  }

  public CT_ColorMRUBuilder from(CT_ColorMRUModel value) {
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
