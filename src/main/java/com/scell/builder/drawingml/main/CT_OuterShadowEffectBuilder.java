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

  private CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;

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

  public CT_OuterShadowEffectBuilder setScrgbClrOrSrgbClrOrHslClr(
      CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
    this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
    return this;
  }

  public CT_OuterShadowEffectModel build() {
    return new CT_OuterShadowEffectModel(this.blurRad, this.dist, this.rotWithShape, this.sy, this.ky, this.sx, this.kx, this.dir, this.algn, this.scrgbClrOrSrgbClrOrHslClr);
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
    this.scrgbClrOrSrgbClrOrHslClr = value.getScrgbClrOrSrgbClrOrHslClr();
    return this;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrBuilder {
    private int type;

    private Object value;

    public ScrgbClrOrSrgbClrOrHslClrBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setScrgbClr(CT_ScRgbColorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setSrgbClr(CT_SRgbColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setHslClr(CT_HslColorModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setSysClr(CT_SystemColorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setSchemeClr(CT_SchemeColorModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder setPrstClr(CT_PresetColorModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel build() {
      if (this.type == -1) return new CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel();
      if (this.type == 0) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newScrgbClr((CT_ScRgbColorModel) this.value);
      if (this.type == 1) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newSrgbClr((CT_SRgbColorModel) this.value);
      if (this.type == 2) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newHslClr((CT_HslColorModel) this.value);
      if (this.type == 3) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newSysClr((CT_SystemColorModel) this.value);
      if (this.type == 4) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newSchemeClr((CT_SchemeColorModel) this.value);
      if (this.type == 5) return CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.newPrstClr((CT_PresetColorModel) this.value);
      return null;
    }

    public ScrgbClrOrSrgbClrOrHslClrBuilder from(
        CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
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
