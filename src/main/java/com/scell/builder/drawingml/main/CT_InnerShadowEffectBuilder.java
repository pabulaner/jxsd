package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_HslColorModel;
import com.scell.model.drawingml.main.CT_InnerShadowEffectModel;
import com.scell.model.drawingml.main.CT_PresetColorModel;
import com.scell.model.drawingml.main.CT_SRgbColorModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.CT_SchemeColorModel;
import com.scell.model.drawingml.main.CT_SystemColorModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;
import java.lang.Object;

public class CT_InnerShadowEffectBuilder {
  private ST_PositiveCoordinateModel blurRad;

  private ST_PositiveCoordinateModel dist;

  private ST_PositiveFixedAngleModel dir;

  private CT_InnerShadowEffectModel.EG_ColorChoiceModel egColorChoice;

  public CT_InnerShadowEffectBuilder() {
  }

  public CT_InnerShadowEffectBuilder setBlurRad(ST_PositiveCoordinateModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public CT_InnerShadowEffectBuilder setDist(ST_PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public CT_InnerShadowEffectBuilder setDir(ST_PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public CT_InnerShadowEffectBuilder setEGColorChoice(
      CT_InnerShadowEffectModel.EG_ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public CT_InnerShadowEffectModel build() {
    return new CT_InnerShadowEffectModel(this.blurRad, this.dist, this.dir, this.egColorChoice);
  }

  public CT_InnerShadowEffectBuilder from(CT_InnerShadowEffectModel value) {
    this.blurRad = value.getBlurRad();
    this.dist = value.getDist();
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

    public CT_InnerShadowEffectModel.EG_ColorChoiceModel build() {
      if (this.type == -1) return new CT_InnerShadowEffectModel.EG_ColorChoiceModel();
      if (this.type == 0) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newScrgbClr((CT_ScRgbColorModel) this.value);
      if (this.type == 1) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSrgbClr((CT_SRgbColorModel) this.value);
      if (this.type == 2) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newHslClr((CT_HslColorModel) this.value);
      if (this.type == 3) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSysClr((CT_SystemColorModel) this.value);
      if (this.type == 4) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSchemeClr((CT_SchemeColorModel) this.value);
      if (this.type == 5) return CT_InnerShadowEffectModel.EG_ColorChoiceModel.newPrstClr((CT_PresetColorModel) this.value);
      return null;
    }

    public EG_ColorChoiceBuilder from(CT_InnerShadowEffectModel.EG_ColorChoiceModel value) {
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
