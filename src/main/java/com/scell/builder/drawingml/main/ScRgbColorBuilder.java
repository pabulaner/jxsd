package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AngleModel;
import com.scell.model.drawingml.main.ComplementTransformModel;
import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.GammaTransformModel;
import com.scell.model.drawingml.main.GrayscaleTransformModel;
import com.scell.model.drawingml.main.InverseGammaTransformModel;
import com.scell.model.drawingml.main.InverseTransformModel;
import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.PositivePercentageModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import java.lang.Object;
import java.util.List;

public class ScRgbColorBuilder {
  private PercentageModel g;

  private PercentageModel r;

  private PercentageModel b;

  private List<ScRgbColorModel.ColorTransformModel> egColorTransform;

  public ScRgbColorBuilder() {
  }

  public ScRgbColorBuilder setG(PercentageModel g) {
    this.g = g;
    return this;
  }

  public ScRgbColorBuilder setR(PercentageModel r) {
    this.r = r;
    return this;
  }

  public ScRgbColorBuilder setB(PercentageModel b) {
    this.b = b;
    return this;
  }

  public ScRgbColorBuilder setEGColorTransform(
      List<ScRgbColorModel.ColorTransformModel> egColorTransform) {
    this.egColorTransform = egColorTransform;
    return this;
  }

  public ScRgbColorModel build() {
    return new ScRgbColorModel(this.g, this.r, this.b, this.egColorTransform);
  }

  public ScRgbColorBuilder from(ScRgbColorModel value) {
    this.g = value.getG();
    this.r = value.getR();
    this.b = value.getB();
    this.egColorTransform = value.getEGColorTransform();
    return this;
  }

  public static class ColorTransformBuilder {
    private int type;

    private Object value;

    public ColorTransformBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ColorTransformBuilder setTint(PositiveFixedPercentageModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setShade(PositiveFixedPercentageModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setComp(ComplementTransformModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setInv(InverseTransformModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setGray(GrayscaleTransformModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setAlpha(PositiveFixedPercentageModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setAlphaOff(FixedPercentageModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setAlphaMod(PositivePercentageModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setHue(PositiveFixedAngleModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setHueOff(AngleModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setHueMod(PositivePercentageModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setSat(PercentageModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setSatOff(PercentageModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setSatMod(PercentageModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setLum(PercentageModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setLumOff(PercentageModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setLumMod(PercentageModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setRed(PercentageModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setRedOff(PercentageModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setRedMod(PercentageModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setGreen(PercentageModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setGreenOff(PercentageModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setGreenMod(PercentageModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setBlue(PercentageModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setBlueOff(PercentageModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setBlueMod(PercentageModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setGamma(GammaTransformModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public ColorTransformBuilder setInvGamma(InverseGammaTransformModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public ScRgbColorModel.ColorTransformModel build() {
      if (this.type == -1) return new ScRgbColorModel.ColorTransformModel();
      if (this.type == 0) return ScRgbColorModel.ColorTransformModel.newTint((PositiveFixedPercentageModel) this.value);
      if (this.type == 1) return ScRgbColorModel.ColorTransformModel.newShade((PositiveFixedPercentageModel) this.value);
      if (this.type == 2) return ScRgbColorModel.ColorTransformModel.newComp((ComplementTransformModel) this.value);
      if (this.type == 3) return ScRgbColorModel.ColorTransformModel.newInv((InverseTransformModel) this.value);
      if (this.type == 4) return ScRgbColorModel.ColorTransformModel.newGray((GrayscaleTransformModel) this.value);
      if (this.type == 5) return ScRgbColorModel.ColorTransformModel.newAlpha((PositiveFixedPercentageModel) this.value);
      if (this.type == 6) return ScRgbColorModel.ColorTransformModel.newAlphaOff((FixedPercentageModel) this.value);
      if (this.type == 7) return ScRgbColorModel.ColorTransformModel.newAlphaMod((PositivePercentageModel) this.value);
      if (this.type == 8) return ScRgbColorModel.ColorTransformModel.newHue((PositiveFixedAngleModel) this.value);
      if (this.type == 9) return ScRgbColorModel.ColorTransformModel.newHueOff((AngleModel) this.value);
      if (this.type == 10) return ScRgbColorModel.ColorTransformModel.newHueMod((PositivePercentageModel) this.value);
      if (this.type == 11) return ScRgbColorModel.ColorTransformModel.newSat((PercentageModel) this.value);
      if (this.type == 12) return ScRgbColorModel.ColorTransformModel.newSatOff((PercentageModel) this.value);
      if (this.type == 13) return ScRgbColorModel.ColorTransformModel.newSatMod((PercentageModel) this.value);
      if (this.type == 14) return ScRgbColorModel.ColorTransformModel.newLum((PercentageModel) this.value);
      if (this.type == 15) return ScRgbColorModel.ColorTransformModel.newLumOff((PercentageModel) this.value);
      if (this.type == 16) return ScRgbColorModel.ColorTransformModel.newLumMod((PercentageModel) this.value);
      if (this.type == 17) return ScRgbColorModel.ColorTransformModel.newRed((PercentageModel) this.value);
      if (this.type == 18) return ScRgbColorModel.ColorTransformModel.newRedOff((PercentageModel) this.value);
      if (this.type == 19) return ScRgbColorModel.ColorTransformModel.newRedMod((PercentageModel) this.value);
      if (this.type == 20) return ScRgbColorModel.ColorTransformModel.newGreen((PercentageModel) this.value);
      if (this.type == 21) return ScRgbColorModel.ColorTransformModel.newGreenOff((PercentageModel) this.value);
      if (this.type == 22) return ScRgbColorModel.ColorTransformModel.newGreenMod((PercentageModel) this.value);
      if (this.type == 23) return ScRgbColorModel.ColorTransformModel.newBlue((PercentageModel) this.value);
      if (this.type == 24) return ScRgbColorModel.ColorTransformModel.newBlueOff((PercentageModel) this.value);
      if (this.type == 25) return ScRgbColorModel.ColorTransformModel.newBlueMod((PercentageModel) this.value);
      if (this.type == 26) return ScRgbColorModel.ColorTransformModel.newGamma((GammaTransformModel) this.value);
      if (this.type == 27) return ScRgbColorModel.ColorTransformModel.newInvGamma((InverseGammaTransformModel) this.value);
      return null;
    }

    public ColorTransformBuilder from(ScRgbColorModel.ColorTransformModel value) {
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
