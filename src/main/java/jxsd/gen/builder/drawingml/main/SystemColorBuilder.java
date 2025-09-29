package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.AngleModel;
import jxsd.gen.model.drawingml.main.ComplementTransformModel;
import jxsd.gen.model.drawingml.main.FixedPercentageModel;
import jxsd.gen.model.drawingml.main.GammaTransformModel;
import jxsd.gen.model.drawingml.main.GrayscaleTransformModel;
import jxsd.gen.model.drawingml.main.InverseGammaTransformModel;
import jxsd.gen.model.drawingml.main.InverseTransformModel;
import jxsd.gen.model.drawingml.main.PercentageModel;
import jxsd.gen.model.drawingml.main.PositiveFixedAngleModel;
import jxsd.gen.model.drawingml.main.PositiveFixedPercentageModel;
import jxsd.gen.model.drawingml.main.PositivePercentageModel;
import jxsd.gen.model.drawingml.main.SystemColorModel;
import jxsd.gen.model.drawingml.main.SystemColorValValueModel;

/**
 * This is a generated sequence class.
 */
public class SystemColorBuilder {
  private SystemColorValValueModel val;

  private String lastClr;

  private List<SystemColorModel.EG_ColorTransform> egColorTransform;

  public SystemColorBuilder() {
  }

  public SystemColorBuilder setVal(SystemColorValValueModel val) {
    this.val = val;
    return this;
  }

  public SystemColorBuilder setLastClr(String lastClr) {
    this.lastClr = lastClr;
    return this;
  }

  public SystemColorBuilder setEGColorTransform(
      List<SystemColorModel.EG_ColorTransform> egColorTransform) {
    this.egColorTransform = egColorTransform;
    return this;
  }

  public SystemColorBuilder from(SystemColorModel value) {
    this.val = value.getVal();
    this.lastClr = value.getLastClr();
    this.egColorTransform = value.getEGColorTransform();
    return this;
  }

  public SystemColorModel build() {
    return new SystemColorModel(this.val, this.lastClr, this.egColorTransform);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ColorTransform {
    private int type;

    private Object value;

    public EG_ColorTransform() {
      this.type = -1;
      this.value = null;
    }

    public EG_ColorTransform setTint(PositiveFixedPercentageModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setShade(PositiveFixedPercentageModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setComp(ComplementTransformModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setInv(InverseTransformModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setGray(GrayscaleTransformModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setAlpha(PositiveFixedPercentageModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setAlphaOff(FixedPercentageModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setAlphaMod(PositivePercentageModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setHue(PositiveFixedAngleModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setHueOff(AngleModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setHueMod(PositivePercentageModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setSat(PercentageModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setSatOff(PercentageModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setSatMod(PercentageModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setLum(PercentageModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setLumOff(PercentageModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setLumMod(PercentageModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setRed(PercentageModel value) {
      this.type = 17;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setRedOff(PercentageModel value) {
      this.type = 18;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setRedMod(PercentageModel value) {
      this.type = 19;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setGreen(PercentageModel value) {
      this.type = 20;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setGreenOff(PercentageModel value) {
      this.type = 21;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setGreenMod(PercentageModel value) {
      this.type = 22;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setBlue(PercentageModel value) {
      this.type = 23;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setBlueOff(PercentageModel value) {
      this.type = 24;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setBlueMod(PercentageModel value) {
      this.type = 25;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setGamma(GammaTransformModel value) {
      this.type = 26;
      this.value = value;
      return this;
    }

    public EG_ColorTransform setInvGamma(InverseGammaTransformModel value) {
      this.type = 27;
      this.value = value;
      return this;
    }

    public EG_ColorTransform from(SystemColorModel.EG_ColorTransform value) {
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

    public SystemColorModel.EG_ColorTransform build() {
      if (this.type == -1) return new SystemColorModel.EG_ColorTransform();
      if (this.type == 0) return SystemColorModel.EG_ColorTransform.newTint((PositiveFixedPercentageModel) this.value);
      if (this.type == 1) return SystemColorModel.EG_ColorTransform.newShade((PositiveFixedPercentageModel) this.value);
      if (this.type == 2) return SystemColorModel.EG_ColorTransform.newComp((ComplementTransformModel) this.value);
      if (this.type == 3) return SystemColorModel.EG_ColorTransform.newInv((InverseTransformModel) this.value);
      if (this.type == 4) return SystemColorModel.EG_ColorTransform.newGray((GrayscaleTransformModel) this.value);
      if (this.type == 5) return SystemColorModel.EG_ColorTransform.newAlpha((PositiveFixedPercentageModel) this.value);
      if (this.type == 6) return SystemColorModel.EG_ColorTransform.newAlphaOff((FixedPercentageModel) this.value);
      if (this.type == 7) return SystemColorModel.EG_ColorTransform.newAlphaMod((PositivePercentageModel) this.value);
      if (this.type == 8) return SystemColorModel.EG_ColorTransform.newHue((PositiveFixedAngleModel) this.value);
      if (this.type == 9) return SystemColorModel.EG_ColorTransform.newHueOff((AngleModel) this.value);
      if (this.type == 10) return SystemColorModel.EG_ColorTransform.newHueMod((PositivePercentageModel) this.value);
      if (this.type == 11) return SystemColorModel.EG_ColorTransform.newSat((PercentageModel) this.value);
      if (this.type == 12) return SystemColorModel.EG_ColorTransform.newSatOff((PercentageModel) this.value);
      if (this.type == 13) return SystemColorModel.EG_ColorTransform.newSatMod((PercentageModel) this.value);
      if (this.type == 14) return SystemColorModel.EG_ColorTransform.newLum((PercentageModel) this.value);
      if (this.type == 15) return SystemColorModel.EG_ColorTransform.newLumOff((PercentageModel) this.value);
      if (this.type == 16) return SystemColorModel.EG_ColorTransform.newLumMod((PercentageModel) this.value);
      if (this.type == 17) return SystemColorModel.EG_ColorTransform.newRed((PercentageModel) this.value);
      if (this.type == 18) return SystemColorModel.EG_ColorTransform.newRedOff((PercentageModel) this.value);
      if (this.type == 19) return SystemColorModel.EG_ColorTransform.newRedMod((PercentageModel) this.value);
      if (this.type == 20) return SystemColorModel.EG_ColorTransform.newGreen((PercentageModel) this.value);
      if (this.type == 21) return SystemColorModel.EG_ColorTransform.newGreenOff((PercentageModel) this.value);
      if (this.type == 22) return SystemColorModel.EG_ColorTransform.newGreenMod((PercentageModel) this.value);
      if (this.type == 23) return SystemColorModel.EG_ColorTransform.newBlue((PercentageModel) this.value);
      if (this.type == 24) return SystemColorModel.EG_ColorTransform.newBlueOff((PercentageModel) this.value);
      if (this.type == 25) return SystemColorModel.EG_ColorTransform.newBlueMod((PercentageModel) this.value);
      if (this.type == 26) return SystemColorModel.EG_ColorTransform.newGamma((GammaTransformModel) this.value);
      if (this.type == 27) return SystemColorModel.EG_ColorTransform.newInvGamma((InverseGammaTransformModel) this.value);
      return null;
    }
  }
}
