package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_HslColorModel {
  private final ST_PositiveFixedAngleModel hue;

  private final ST_PercentageModel lum;

  private final ST_PercentageModel sat;

  private final List<EG_ColorTransformModel> egColorTransform;

  public CT_HslColorModel(ST_PositiveFixedAngleModel hue, ST_PercentageModel lum,
      ST_PercentageModel sat, List<EG_ColorTransformModel> egColorTransform) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
    this.egColorTransform = egColorTransform;
  }

  public ST_PositiveFixedAngleModel getHue() {
    return this.hue;
  }

  public ST_PercentageModel getLum() {
    return this.lum;
  }

  public ST_PercentageModel getSat() {
    return this.sat;
  }

  public List<EG_ColorTransformModel> getEGColorTransform() {
    return this.egColorTransform;
  }

  public static class EG_ColorTransformModel {
    private final int type;

    private final Object value;

    public EG_ColorTransformModel() {
      this(-1, null);
    }

    private EG_ColorTransformModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_ColorTransformModel newTint(CT_PositiveFixedPercentageModel value) {
      return new EG_ColorTransformModel(0, value);
    }

    public boolean isTint() {
      return this.type == 0;
    }

    public CT_PositiveFixedPercentageModel getTint() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransformModel newShade(CT_PositiveFixedPercentageModel value) {
      return new EG_ColorTransformModel(1, value);
    }

    public boolean isShade() {
      return this.type == 1;
    }

    public CT_PositiveFixedPercentageModel getShade() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransformModel newComp(CT_ComplementTransformModel value) {
      return new EG_ColorTransformModel(2, value);
    }

    public boolean isComp() {
      return this.type == 2;
    }

    public CT_ComplementTransformModel getComp() {
      return (CT_ComplementTransformModel) this.value;
    }

    public static EG_ColorTransformModel newInv(CT_InverseTransformModel value) {
      return new EG_ColorTransformModel(3, value);
    }

    public boolean isInv() {
      return this.type == 3;
    }

    public CT_InverseTransformModel getInv() {
      return (CT_InverseTransformModel) this.value;
    }

    public static EG_ColorTransformModel newGray(CT_GrayscaleTransformModel value) {
      return new EG_ColorTransformModel(4, value);
    }

    public boolean isGray() {
      return this.type == 4;
    }

    public CT_GrayscaleTransformModel getGray() {
      return (CT_GrayscaleTransformModel) this.value;
    }

    public static EG_ColorTransformModel newAlpha(CT_PositiveFixedPercentageModel value) {
      return new EG_ColorTransformModel(5, value);
    }

    public boolean isAlpha() {
      return this.type == 5;
    }

    public CT_PositiveFixedPercentageModel getAlpha() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransformModel newAlphaOff(CT_FixedPercentageModel value) {
      return new EG_ColorTransformModel(6, value);
    }

    public boolean isAlphaOff() {
      return this.type == 6;
    }

    public CT_FixedPercentageModel getAlphaOff() {
      return (CT_FixedPercentageModel) this.value;
    }

    public static EG_ColorTransformModel newAlphaMod(CT_PositivePercentageModel value) {
      return new EG_ColorTransformModel(7, value);
    }

    public boolean isAlphaMod() {
      return this.type == 7;
    }

    public CT_PositivePercentageModel getAlphaMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static EG_ColorTransformModel newHue(CT_PositiveFixedAngleModel value) {
      return new EG_ColorTransformModel(8, value);
    }

    public boolean isHue() {
      return this.type == 8;
    }

    public CT_PositiveFixedAngleModel getHue() {
      return (CT_PositiveFixedAngleModel) this.value;
    }

    public static EG_ColorTransformModel newHueOff(CT_AngleModel value) {
      return new EG_ColorTransformModel(9, value);
    }

    public boolean isHueOff() {
      return this.type == 9;
    }

    public CT_AngleModel getHueOff() {
      return (CT_AngleModel) this.value;
    }

    public static EG_ColorTransformModel newHueMod(CT_PositivePercentageModel value) {
      return new EG_ColorTransformModel(10, value);
    }

    public boolean isHueMod() {
      return this.type == 10;
    }

    public CT_PositivePercentageModel getHueMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static EG_ColorTransformModel newSat(CT_PercentageModel value) {
      return new EG_ColorTransformModel(11, value);
    }

    public boolean isSat() {
      return this.type == 11;
    }

    public CT_PercentageModel getSat() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newSatOff(CT_PercentageModel value) {
      return new EG_ColorTransformModel(12, value);
    }

    public boolean isSatOff() {
      return this.type == 12;
    }

    public CT_PercentageModel getSatOff() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newSatMod(CT_PercentageModel value) {
      return new EG_ColorTransformModel(13, value);
    }

    public boolean isSatMod() {
      return this.type == 13;
    }

    public CT_PercentageModel getSatMod() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newLum(CT_PercentageModel value) {
      return new EG_ColorTransformModel(14, value);
    }

    public boolean isLum() {
      return this.type == 14;
    }

    public CT_PercentageModel getLum() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newLumOff(CT_PercentageModel value) {
      return new EG_ColorTransformModel(15, value);
    }

    public boolean isLumOff() {
      return this.type == 15;
    }

    public CT_PercentageModel getLumOff() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newLumMod(CT_PercentageModel value) {
      return new EG_ColorTransformModel(16, value);
    }

    public boolean isLumMod() {
      return this.type == 16;
    }

    public CT_PercentageModel getLumMod() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newRed(CT_PercentageModel value) {
      return new EG_ColorTransformModel(17, value);
    }

    public boolean isRed() {
      return this.type == 17;
    }

    public CT_PercentageModel getRed() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newRedOff(CT_PercentageModel value) {
      return new EG_ColorTransformModel(18, value);
    }

    public boolean isRedOff() {
      return this.type == 18;
    }

    public CT_PercentageModel getRedOff() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newRedMod(CT_PercentageModel value) {
      return new EG_ColorTransformModel(19, value);
    }

    public boolean isRedMod() {
      return this.type == 19;
    }

    public CT_PercentageModel getRedMod() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newGreen(CT_PercentageModel value) {
      return new EG_ColorTransformModel(20, value);
    }

    public boolean isGreen() {
      return this.type == 20;
    }

    public CT_PercentageModel getGreen() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newGreenOff(CT_PercentageModel value) {
      return new EG_ColorTransformModel(21, value);
    }

    public boolean isGreenOff() {
      return this.type == 21;
    }

    public CT_PercentageModel getGreenOff() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newGreenMod(CT_PercentageModel value) {
      return new EG_ColorTransformModel(22, value);
    }

    public boolean isGreenMod() {
      return this.type == 22;
    }

    public CT_PercentageModel getGreenMod() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newBlue(CT_PercentageModel value) {
      return new EG_ColorTransformModel(23, value);
    }

    public boolean isBlue() {
      return this.type == 23;
    }

    public CT_PercentageModel getBlue() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newBlueOff(CT_PercentageModel value) {
      return new EG_ColorTransformModel(24, value);
    }

    public boolean isBlueOff() {
      return this.type == 24;
    }

    public CT_PercentageModel getBlueOff() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newBlueMod(CT_PercentageModel value) {
      return new EG_ColorTransformModel(25, value);
    }

    public boolean isBlueMod() {
      return this.type == 25;
    }

    public CT_PercentageModel getBlueMod() {
      return (CT_PercentageModel) this.value;
    }

    public static EG_ColorTransformModel newGamma(CT_GammaTransformModel value) {
      return new EG_ColorTransformModel(26, value);
    }

    public boolean isGamma() {
      return this.type == 26;
    }

    public CT_GammaTransformModel getGamma() {
      return (CT_GammaTransformModel) this.value;
    }

    public static EG_ColorTransformModel newInvGamma(CT_InverseGammaTransformModel value) {
      return new EG_ColorTransformModel(27, value);
    }

    public boolean isInvGamma() {
      return this.type == 27;
    }

    public CT_InverseGammaTransformModel getInvGamma() {
      return (CT_InverseGammaTransformModel) this.value;
    }
  }
}
