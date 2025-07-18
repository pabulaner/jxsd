package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_HslColorModel;
import com.scell.model.drawingml.main.CT_OuterShadowEffectModel;
import com.scell.model.drawingml.main.CT_PresetColorModel;
import com.scell.model.drawingml.main.CT_SRgbColorModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.CT_SchemeColorModel;
import com.scell.model.drawingml.main.CT_SystemColorModel;
import com.scell.model.drawingml.main.ST_FixedAngleModel;
import com.scell.model.drawingml.main.ST_PercentageModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;
import com.scell.model.drawingml.main.ST_RectAlignmentModel;
import java.lang.Object;

public class CT_OuterShadowEffectBuilder {
  private ST_PositiveCoordinateModel blurRad;

  private ST_PositiveCoordinateModel dist;

  private BooleanModel rotWithShape;

  private ST_PercentageModel sy;

  private ST_FixedAngleModel ky;

  private ST_PercentageModel sx;

  private ST_FixedAngleModel kx;

  private ST_PositiveFixedAngleModel dir;

  private ST_RectAlignmentModel algn;

  private CT_OuterShadowEffectModel.EG_ColorChoiceModel egColorChoice;

  public CT_OuterShadowEffectBuilder() {
  }

  public CT_OuterShadowEffectBuilder setBlurRad(ST_PositiveCoordinateModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public CT_OuterShadowEffectBuilder setDist(ST_PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public CT_OuterShadowEffectBuilder setRotWithShape(BooleanModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public CT_OuterShadowEffectBuilder setSy(ST_PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public CT_OuterShadowEffectBuilder setKy(ST_FixedAngleModel ky) {
    this.ky = ky;
    return this;
  }

  public CT_OuterShadowEffectBuilder setSx(ST_PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public CT_OuterShadowEffectBuilder setKx(ST_FixedAngleModel kx) {
    this.kx = kx;
    return this;
  }

  public CT_OuterShadowEffectBuilder setDir(ST_PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public CT_OuterShadowEffectBuilder setAlgn(ST_RectAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_OuterShadowEffectBuilder setEGColorChoice(
      CT_OuterShadowEffectModel.EG_ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public CT_OuterShadowEffectModel build() {
    return new CT_OuterShadowEffectModel(this.blurRad, this.dist, this.rotWithShape, this.sy, this.ky, this.sx, this.kx, this.dir, this.algn, this.egColorChoice);
  }

  public CT_OuterShadowEffectBuilder from(CT_OuterShadowEffectModel value) {
    this.blurRad = value.getBlurRad();
    this.dist = value.getDist();
    this.rotWithShape = value.getRotWithShape();
    this.sy = value.getSy();
    this.ky = value.getKy();
    this.sx = value.getSx();
    this.kx = value.getKx();
    this.dir = value.getDir();
    this.algn = value.getAlgn();
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

    public CT_OuterShadowEffectModel.EG_ColorChoiceModel build() {
      if (this.type == -1) return new CT_OuterShadowEffectModel.EG_ColorChoiceModel();
      if (this.type == 0) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newScrgbClr((CT_ScRgbColorModel) this.value);
      if (this.type == 1) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSrgbClr((CT_SRgbColorModel) this.value);
      if (this.type == 2) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newHslClr((CT_HslColorModel) this.value);
      if (this.type == 3) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSysClr((CT_SystemColorModel) this.value);
      if (this.type == 4) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSchemeClr((CT_SchemeColorModel) this.value);
      if (this.type == 5) return CT_OuterShadowEffectModel.EG_ColorChoiceModel.newPrstClr((CT_PresetColorModel) this.value);
      return null;
    }

    public EG_ColorChoiceBuilder from(CT_OuterShadowEffectModel.EG_ColorChoiceModel value) {
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
