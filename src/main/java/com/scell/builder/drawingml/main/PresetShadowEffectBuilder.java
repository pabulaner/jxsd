package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.PositiveCoordinateModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.PresetShadowEffectModel;
import com.scell.model.drawingml.main.PresetShadowValModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;

public class PresetShadowEffectBuilder {
  private PositiveCoordinateModel dist;

  private PresetShadowValModel prst;

  private PositiveFixedAngleModel dir;

  private PresetShadowEffectModel.ColorChoiceModel egColorChoice;

  public PresetShadowEffectBuilder() {
  }

  public PresetShadowEffectBuilder setDist(PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public PresetShadowEffectBuilder setPrst(PresetShadowValModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetShadowEffectBuilder setDir(PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public PresetShadowEffectBuilder setEGColorChoice(
      PresetShadowEffectModel.ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public PresetShadowEffectModel build() {
    return new PresetShadowEffectModel(this.dist, this.prst, this.dir, this.egColorChoice);
  }

  public PresetShadowEffectBuilder from(PresetShadowEffectModel value) {
    this.dist = value.getDist();
    this.prst = value.getPrst();
    this.dir = value.getDir();
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

    public PresetShadowEffectModel.ColorChoiceModel build() {
      if (this.type == -1) return new PresetShadowEffectModel.ColorChoiceModel();
      if (this.type == 0) return PresetShadowEffectModel.ColorChoiceModel.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return PresetShadowEffectModel.ColorChoiceModel.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return PresetShadowEffectModel.ColorChoiceModel.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return PresetShadowEffectModel.ColorChoiceModel.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return PresetShadowEffectModel.ColorChoiceModel.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return PresetShadowEffectModel.ColorChoiceModel.newPrstClr((PresetColorModel) this.value);
      return null;
    }

    public ColorChoiceBuilder from(PresetShadowEffectModel.ColorChoiceModel value) {
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
