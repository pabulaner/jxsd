package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AngleModel;
import com.scell.model.drawingml.main.CT_ComplementTransformModel;
import com.scell.model.drawingml.main.CT_FixedPercentageModel;
import com.scell.model.drawingml.main.CT_GammaTransformModel;
import com.scell.model.drawingml.main.CT_GrayscaleTransformModel;
import com.scell.model.drawingml.main.CT_InverseGammaTransformModel;
import com.scell.model.drawingml.main.CT_InverseTransformModel;
import com.scell.model.drawingml.main.CT_PercentageModel;
import com.scell.model.drawingml.main.CT_PositiveFixedAngleModel;
import com.scell.model.drawingml.main.CT_PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.CT_PositivePercentageModel;
import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import com.scell.model.drawingml.main.ST_PercentageModel;
import java.lang.Object;
import java.util.List;

public class CT_ScRgbColorBuilder {
  private ST_PercentageModel g;

  private ST_PercentageModel r;

  private ST_PercentageModel b;

  private List<CT_ScRgbColorModel.TintOrShadeOrCompModel> tintOrShadeOrComp;

  public CT_ScRgbColorBuilder() {
  }

  public CT_ScRgbColorBuilder setG(ST_PercentageModel g) {
    this.g = g;
    return this;
  }

  public CT_ScRgbColorBuilder setR(ST_PercentageModel r) {
    this.r = r;
    return this;
  }

  public CT_ScRgbColorBuilder setB(ST_PercentageModel b) {
    this.b = b;
    return this;
  }

  public CT_ScRgbColorBuilder setTintOrShadeOrComp(
      List<CT_ScRgbColorModel.TintOrShadeOrCompModel> tintOrShadeOrComp) {
    this.tintOrShadeOrComp = tintOrShadeOrComp;
    return this;
  }

  public CT_ScRgbColorModel build() {
    return new CT_ScRgbColorModel(this.g, this.r, this.b, this.tintOrShadeOrComp);
  }

  public CT_ScRgbColorBuilder from(CT_ScRgbColorModel value) {
    this.g = value.getG();
    this.r = value.getR();
    this.b = value.getB();
    this.tintOrShadeOrComp = value.getTintOrShadeOrComp();
    return this;
  }

  public static class TintOrShadeOrCompBuilder {
    private int type;

    private Object value;

    public TintOrShadeOrCompBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TintOrShadeOrCompBuilder setTint(CT_PositiveFixedPercentageModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setShade(CT_PositiveFixedPercentageModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setComp(CT_ComplementTransformModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setInv(CT_InverseTransformModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setGray(CT_GrayscaleTransformModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setAlpha(CT_PositiveFixedPercentageModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setAlphaOff(CT_FixedPercentageModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setAlphaMod(CT_PositivePercentageModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setHue(CT_PositiveFixedAngleModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setHueOff(CT_AngleModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setHueMod(CT_PositivePercentageModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setSat(CT_PercentageModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setSatOff(CT_PercentageModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setSatMod(CT_PercentageModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setLum(CT_PercentageModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setLumOff(CT_PercentageModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setLumMod(CT_PercentageModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setRed(CT_PercentageModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setRedOff(CT_PercentageModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setRedMod(CT_PercentageModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setGreen(CT_PercentageModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setGreenOff(CT_PercentageModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setGreenMod(CT_PercentageModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setBlue(CT_PercentageModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setBlueOff(CT_PercentageModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setBlueMod(CT_PercentageModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setGamma(CT_GammaTransformModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public TintOrShadeOrCompBuilder setInvGamma(CT_InverseGammaTransformModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public CT_ScRgbColorModel.TintOrShadeOrCompModel build() {
      if (this.type == -1) return new CT_ScRgbColorModel.TintOrShadeOrCompModel();
      if (this.type == 0) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newTint((CT_PositiveFixedPercentageModel) this.value);
      if (this.type == 1) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newShade((CT_PositiveFixedPercentageModel) this.value);
      if (this.type == 2) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newComp((CT_ComplementTransformModel) this.value);
      if (this.type == 3) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newInv((CT_InverseTransformModel) this.value);
      if (this.type == 4) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newGray((CT_GrayscaleTransformModel) this.value);
      if (this.type == 5) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newAlpha((CT_PositiveFixedPercentageModel) this.value);
      if (this.type == 6) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newAlphaOff((CT_FixedPercentageModel) this.value);
      if (this.type == 7) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newAlphaMod((CT_PositivePercentageModel) this.value);
      if (this.type == 8) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newHue((CT_PositiveFixedAngleModel) this.value);
      if (this.type == 9) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newHueOff((CT_AngleModel) this.value);
      if (this.type == 10) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newHueMod((CT_PositivePercentageModel) this.value);
      if (this.type == 11) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newSat((CT_PercentageModel) this.value);
      if (this.type == 12) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newSatOff((CT_PercentageModel) this.value);
      if (this.type == 13) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newSatMod((CT_PercentageModel) this.value);
      if (this.type == 14) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newLum((CT_PercentageModel) this.value);
      if (this.type == 15) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newLumOff((CT_PercentageModel) this.value);
      if (this.type == 16) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newLumMod((CT_PercentageModel) this.value);
      if (this.type == 17) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newRed((CT_PercentageModel) this.value);
      if (this.type == 18) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newRedOff((CT_PercentageModel) this.value);
      if (this.type == 19) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newRedMod((CT_PercentageModel) this.value);
      if (this.type == 20) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newGreen((CT_PercentageModel) this.value);
      if (this.type == 21) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newGreenOff((CT_PercentageModel) this.value);
      if (this.type == 22) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newGreenMod((CT_PercentageModel) this.value);
      if (this.type == 23) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newBlue((CT_PercentageModel) this.value);
      if (this.type == 24) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newBlueOff((CT_PercentageModel) this.value);
      if (this.type == 25) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newBlueMod((CT_PercentageModel) this.value);
      if (this.type == 26) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newGamma((CT_GammaTransformModel) this.value);
      if (this.type == 27) return CT_ScRgbColorModel.TintOrShadeOrCompModel.newInvGamma((CT_InverseGammaTransformModel) this.value);
      return null;
    }

    public TintOrShadeOrCompBuilder from(CT_ScRgbColorModel.TintOrShadeOrCompModel value) {
      this.type = -1;
      this.value = null;
      if (value.isTint()) {
        this.type = 0;
        this.value = value.getTint();
      }
      if (value.isShade()) {
        this.type = 1;
        this.value = value.getShade();
      }
      if (value.isComp()) {
        this.type = 2;
        this.value = value.getComp();
      }
      if (value.isInv()) {
        this.type = 3;
        this.value = value.getInv();
      }
      if (value.isGray()) {
        this.type = 4;
        this.value = value.getGray();
      }
      if (value.isAlpha()) {
        this.type = 5;
        this.value = value.getAlpha();
      }
      if (value.isAlphaOff()) {
        this.type = 6;
        this.value = value.getAlphaOff();
      }
      if (value.isAlphaMod()) {
        this.type = 7;
        this.value = value.getAlphaMod();
      }
      if (value.isHue()) {
        this.type = 8;
        this.value = value.getHue();
      }
      if (value.isHueOff()) {
        this.type = 9;
        this.value = value.getHueOff();
      }
      if (value.isHueMod()) {
        this.type = 10;
        this.value = value.getHueMod();
      }
      if (value.isSat()) {
        this.type = 11;
        this.value = value.getSat();
      }
      if (value.isSatOff()) {
        this.type = 12;
        this.value = value.getSatOff();
      }
      if (value.isSatMod()) {
        this.type = 13;
        this.value = value.getSatMod();
      }
      if (value.isLum()) {
        this.type = 14;
        this.value = value.getLum();
      }
      if (value.isLumOff()) {
        this.type = 15;
        this.value = value.getLumOff();
      }
      if (value.isLumMod()) {
        this.type = 16;
        this.value = value.getLumMod();
      }
      if (value.isRed()) {
        this.type = 17;
        this.value = value.getRed();
      }
      if (value.isRedOff()) {
        this.type = 18;
        this.value = value.getRedOff();
      }
      if (value.isRedMod()) {
        this.type = 19;
        this.value = value.getRedMod();
      }
      if (value.isGreen()) {
        this.type = 20;
        this.value = value.getGreen();
      }
      if (value.isGreenOff()) {
        this.type = 21;
        this.value = value.getGreenOff();
      }
      if (value.isGreenMod()) {
        this.type = 22;
        this.value = value.getGreenMod();
      }
      if (value.isBlue()) {
        this.type = 23;
        this.value = value.getBlue();
      }
      if (value.isBlueOff()) {
        this.type = 24;
        this.value = value.getBlueOff();
      }
      if (value.isBlueMod()) {
        this.type = 25;
        this.value = value.getBlueMod();
      }
      if (value.isGamma()) {
        this.type = 26;
        this.value = value.getGamma();
      }
      if (value.isInvGamma()) {
        this.type = 27;
        this.value = value.getInvGamma();
      }
      return this;
    }
  }
}
