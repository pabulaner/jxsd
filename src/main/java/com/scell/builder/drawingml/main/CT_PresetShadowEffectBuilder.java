package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_HslColorModel;
import com.scell.model.drawingml.main.CT_PresetColorModel;
import com.scell.model.drawingml.main.CT_PresetShadowEffectModel;
import com.scell.model.drawingml.main.CT_SRgbColorModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.CT_SchemeColorModel;
import com.scell.model.drawingml.main.CT_SystemColorModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;
import com.scell.model.drawingml.main.ST_PresetShadowValModel;
import java.lang.Object;

public class CT_PresetShadowEffectBuilder {
  private ST_PositiveCoordinateModel dist;

  private ST_PresetShadowValModel prst;

  private ST_PositiveFixedAngleModel dir;

  private CT_PresetShadowEffectModel.EG_ColorChoiceModel egColorChoice;

  public CT_PresetShadowEffectBuilder() {
  }

  public CT_PresetShadowEffectBuilder setDist(ST_PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public CT_PresetShadowEffectBuilder setPrst(ST_PresetShadowValModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_PresetShadowEffectBuilder setDir(ST_PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public CT_PresetShadowEffectBuilder setEGColorChoice(
      CT_PresetShadowEffectModel.EG_ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public CT_PresetShadowEffectModel build() {
    return new CT_PresetShadowEffectModel(this.dist, this.prst, this.dir, this.egColorChoice);
  }

  public CT_PresetShadowEffectBuilder from(CT_PresetShadowEffectModel value) {
    this.dist = value.getDist();
    this.prst = value.getPrst();
    this.dir = value.getDir();
    this.egColorChoice = value.getEGColorChoice();
    return this;
  }

  public static class EG_ColorChoiceBuilder {
    private int type;

    private Object value;

    public EG_ColorChoiceBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_ColorChoiceBuilder setScrgbClr(CT_ScRgbColorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_ColorChoiceBuilder setSrgbClr(CT_SRgbColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_ColorChoiceBuilder setHslClr(CT_HslColorModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_ColorChoiceBuilder setSysClr(CT_SystemColorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_ColorChoiceBuilder setSchemeClr(CT_SchemeColorModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_ColorChoiceBuilder setPrstClr(CT_PresetColorModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_PresetShadowEffectModel.EG_ColorChoiceModel build() {
      if (this.type == -1) return new CT_PresetShadowEffectModel.EG_ColorChoiceModel();
      if (this.type == 0) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newScrgbClr((CT_ScRgbColorModel) this.value);
      if (this.type == 1) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSrgbClr((CT_SRgbColorModel) this.value);
      if (this.type == 2) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newHslClr((CT_HslColorModel) this.value);
      if (this.type == 3) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSysClr((CT_SystemColorModel) this.value);
      if (this.type == 4) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSchemeClr((CT_SchemeColorModel) this.value);
      if (this.type == 5) return CT_PresetShadowEffectModel.EG_ColorChoiceModel.newPrstClr((CT_PresetColorModel) this.value);
      return null;
    }

    public EG_ColorChoiceBuilder from(CT_PresetShadowEffectModel.EG_ColorChoiceModel value) {
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
}
