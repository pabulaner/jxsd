package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.FixedAngleValueModel;
import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.OuterShadowEffectModel;
import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.PositiveCoordinateValueModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.RectAlignmentValueModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;

public class OuterShadowEffectBuilder {
  private PositiveCoordinateValueModel blurRad;

  private PositiveCoordinateValueModel dist;

  private BooleanValueModel rotWithShape;

  private PercentageValueModel sy;

  private FixedAngleValueModel ky;

  private PercentageValueModel sx;

  private FixedAngleValueModel kx;

  private PositiveFixedAngleValueModel dir;

  private RectAlignmentValueModel algn;

  private OuterShadowEffectModel.ColorChoiceModel egColorChoice;

  public OuterShadowEffectBuilder() {
  }

  public OuterShadowEffectBuilder setBlurRad(PositiveCoordinateValueModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public OuterShadowEffectBuilder setDist(PositiveCoordinateValueModel dist) {
    this.dist = dist;
    return this;
  }

  public OuterShadowEffectBuilder setRotWithShape(BooleanValueModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public OuterShadowEffectBuilder setSy(PercentageValueModel sy) {
    this.sy = sy;
    return this;
  }

  public OuterShadowEffectBuilder setKy(FixedAngleValueModel ky) {
    this.ky = ky;
    return this;
  }

  public OuterShadowEffectBuilder setSx(PercentageValueModel sx) {
    this.sx = sx;
    return this;
  }

  public OuterShadowEffectBuilder setKx(FixedAngleValueModel kx) {
    this.kx = kx;
    return this;
  }

  public OuterShadowEffectBuilder setDir(PositiveFixedAngleValueModel dir) {
    this.dir = dir;
    return this;
  }

  public OuterShadowEffectBuilder setAlgn(RectAlignmentValueModel algn) {
    this.algn = algn;
    return this;
  }

  public OuterShadowEffectBuilder setEGColorChoice(
      OuterShadowEffectModel.ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public OuterShadowEffectModel build() {
    return new OuterShadowEffectModel(this.blurRad, this.dist, this.rotWithShape, this.sy, this.ky, this.sx, this.kx, this.dir, this.algn, this.egColorChoice);
  }

  public OuterShadowEffectBuilder from(OuterShadowEffectModel value) {
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

  public static class ColorChoiceBuilder {
    private int type;

    private Object value;

    public ColorChoiceBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ColorChoiceBuilder setScrgbClr(ScRgbColorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSrgbClr(SRgbColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setHslClr(HslColorModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSysClr(SystemColorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSchemeClr(SchemeColorModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setPrstClr(PresetColorModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public OuterShadowEffectModel.ColorChoiceModel build() {
      if (this.type == -1) return new OuterShadowEffectModel.ColorChoiceModel();
      if (this.type == 0) return OuterShadowEffectModel.ColorChoiceModel.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return OuterShadowEffectModel.ColorChoiceModel.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return OuterShadowEffectModel.ColorChoiceModel.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return OuterShadowEffectModel.ColorChoiceModel.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return OuterShadowEffectModel.ColorChoiceModel.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return OuterShadowEffectModel.ColorChoiceModel.newPrstClr((PresetColorModel) this.value);
      return null;
    }

    public ColorChoiceBuilder from(OuterShadowEffectModel.ColorChoiceModel value) {
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
