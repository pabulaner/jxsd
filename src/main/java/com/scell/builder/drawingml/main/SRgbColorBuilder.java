package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AngleModel;
import com.scell.model.drawingml.main.ComplementTransformModel;
import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.GammaTransformModel;
import com.scell.model.drawingml.main.GrayscaleTransformModel;
import com.scell.model.drawingml.main.HexBinary3ValueModel;
import com.scell.model.drawingml.main.InverseGammaTransformModel;
import com.scell.model.drawingml.main.InverseTransformModel;
import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.PositivePercentageModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import java.lang.Object;
import java.util.List;

public class SRgbColorBuilder {
  private HexBinary3ValueModel val;

  private List<SRgbColorModel.ColorTransformModel> egColorTransform;

  public SRgbColorBuilder() {
  }

  public SRgbColorBuilder setVal(HexBinary3ValueModel val) {
    this.val = val;
    return this;
  }

  public SRgbColorBuilder setEGColorTransform(
      List<SRgbColorModel.ColorTransformModel> egColorTransform) {
    this.egColorTransform = egColorTransform;
    return this;
  }

  public SRgbColorModel build() {
    return new SRgbColorModel(this.val, this.egColorTransform);
  }

  public SRgbColorBuilder from(SRgbColorModel value) {
    this.val = value.getVal();
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

    public SRgbColorModel.ColorTransformModel build() {
      if (this.type == -1) return new SRgbColorModel.ColorTransformModel();
      if (this.type == 0) return SRgbColorModel.ColorTransformModel.newTint((PositiveFixedPercentageModel) this.value);
      if (this.type == 1) return SRgbColorModel.ColorTransformModel.newShade((PositiveFixedPercentageModel) this.value);
      if (this.type == 2) return SRgbColorModel.ColorTransformModel.newComp((ComplementTransformModel) this.value);
      if (this.type == 3) return SRgbColorModel.ColorTransformModel.newInv((InverseTransformModel) this.value);
      if (this.type == 4) return SRgbColorModel.ColorTransformModel.newGray((GrayscaleTransformModel) this.value);
      if (this.type == 5) return SRgbColorModel.ColorTransformModel.newAlpha((PositiveFixedPercentageModel) this.value);
      if (this.type == 6) return SRgbColorModel.ColorTransformModel.newAlphaOff((FixedPercentageModel) this.value);
      if (this.type == 7) return SRgbColorModel.ColorTransformModel.newAlphaMod((PositivePercentageModel) this.value);
      if (this.type == 8) return SRgbColorModel.ColorTransformModel.newHue((PositiveFixedAngleModel) this.value);
      if (this.type == 9) return SRgbColorModel.ColorTransformModel.newHueOff((AngleModel) this.value);
      if (this.type == 10) return SRgbColorModel.ColorTransformModel.newHueMod((PositivePercentageModel) this.value);
      if (this.type == 11) return SRgbColorModel.ColorTransformModel.newSat((PercentageModel) this.value);
      if (this.type == 12) return SRgbColorModel.ColorTransformModel.newSatOff((PercentageModel) this.value);
      if (this.type == 13) return SRgbColorModel.ColorTransformModel.newSatMod((PercentageModel) this.value);
      if (this.type == 14) return SRgbColorModel.ColorTransformModel.newLum((PercentageModel) this.value);
      if (this.type == 15) return SRgbColorModel.ColorTransformModel.newLumOff((PercentageModel) this.value);
      if (this.type == 16) return SRgbColorModel.ColorTransformModel.newLumMod((PercentageModel) this.value);
      if (this.type == 17) return SRgbColorModel.ColorTransformModel.newRed((PercentageModel) this.value);
      if (this.type == 18) return SRgbColorModel.ColorTransformModel.newRedOff((PercentageModel) this.value);
      if (this.type == 19) return SRgbColorModel.ColorTransformModel.newRedMod((PercentageModel) this.value);
      if (this.type == 20) return SRgbColorModel.ColorTransformModel.newGreen((PercentageModel) this.value);
      if (this.type == 21) return SRgbColorModel.ColorTransformModel.newGreenOff((PercentageModel) this.value);
      if (this.type == 22) return SRgbColorModel.ColorTransformModel.newGreenMod((PercentageModel) this.value);
      if (this.type == 23) return SRgbColorModel.ColorTransformModel.newBlue((PercentageModel) this.value);
      if (this.type == 24) return SRgbColorModel.ColorTransformModel.newBlueOff((PercentageModel) this.value);
      if (this.type == 25) return SRgbColorModel.ColorTransformModel.newBlueMod((PercentageModel) this.value);
      if (this.type == 26) return SRgbColorModel.ColorTransformModel.newGamma((GammaTransformModel) this.value);
      if (this.type == 27) return SRgbColorModel.ColorTransformModel.newInvGamma((InverseGammaTransformModel) this.value);
      return null;
    }

    public ColorTransformBuilder from(SRgbColorModel.ColorTransformModel value) {
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
