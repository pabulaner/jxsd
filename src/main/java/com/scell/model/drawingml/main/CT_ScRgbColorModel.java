package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_ScRgbColorModel {
  private final ST_PercentageModel g;

  private final ST_PercentageModel r;

  private final ST_PercentageModel b;

  private final List<TintOrShadeOrCompModel> tintOrShadeOrComp;

  public CT_ScRgbColorModel(ST_PercentageModel g, ST_PercentageModel r, ST_PercentageModel b,
      List<TintOrShadeOrCompModel> tintOrShadeOrComp) {
    this.g = g;
    this.r = r;
    this.b = b;
    this.tintOrShadeOrComp = tintOrShadeOrComp;
  }

  public ST_PercentageModel getG() {
    return this.g;
  }

  public ST_PercentageModel getR() {
    return this.r;
  }

  public ST_PercentageModel getB() {
    return this.b;
  }

  public List<TintOrShadeOrCompModel> getTintOrShadeOrComp() {
    return this.tintOrShadeOrComp;
  }

  public static class TintOrShadeOrCompModel {
    private final int type;

    private final Object value;

    public TintOrShadeOrCompModel() {
      this(-1, null);
    }

    private TintOrShadeOrCompModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TintOrShadeOrCompModel newTint(CT_PositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(0, value);
    }

    public boolean isTint() {
      return this.type == 0;
    }

    public CT_PositiveFixedPercentageModel getTint() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newShade(CT_PositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(1, value);
    }

    public boolean isShade() {
      return this.type == 1;
    }

    public CT_PositiveFixedPercentageModel getShade() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newComp(CT_ComplementTransformModel value) {
      return new TintOrShadeOrCompModel(2, value);
    }

    public boolean isComp() {
      return this.type == 2;
    }

    public CT_ComplementTransformModel getComp() {
      return (CT_ComplementTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newInv(CT_InverseTransformModel value) {
      return new TintOrShadeOrCompModel(3, value);
    }

    public boolean isInv() {
      return this.type == 3;
    }

    public CT_InverseTransformModel getInv() {
      return (CT_InverseTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newGray(CT_GrayscaleTransformModel value) {
      return new TintOrShadeOrCompModel(4, value);
    }

    public boolean isGray() {
      return this.type == 4;
    }

    public CT_GrayscaleTransformModel getGray() {
      return (CT_GrayscaleTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlpha(CT_PositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(5, value);
    }

    public boolean isAlpha() {
      return this.type == 5;
    }

    public CT_PositiveFixedPercentageModel getAlpha() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlphaOff(CT_FixedPercentageModel value) {
      return new TintOrShadeOrCompModel(6, value);
    }

    public boolean isAlphaOff() {
      return this.type == 6;
    }

    public CT_FixedPercentageModel getAlphaOff() {
      return (CT_FixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlphaMod(CT_PositivePercentageModel value) {
      return new TintOrShadeOrCompModel(7, value);
    }

    public boolean isAlphaMod() {
      return this.type == 7;
    }

    public CT_PositivePercentageModel getAlphaMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newHue(CT_PositiveFixedAngleModel value) {
      return new TintOrShadeOrCompModel(8, value);
    }

    public boolean isHue() {
      return this.type == 8;
    }

    public CT_PositiveFixedAngleModel getHue() {
      return (CT_PositiveFixedAngleModel) this.value;
    }

    public static TintOrShadeOrCompModel newHueOff(CT_AngleModel value) {
      return new TintOrShadeOrCompModel(9, value);
    }

    public boolean isHueOff() {
      return this.type == 9;
    }

    public CT_AngleModel getHueOff() {
      return (CT_AngleModel) this.value;
    }

    public static TintOrShadeOrCompModel newHueMod(CT_PositivePercentageModel value) {
      return new TintOrShadeOrCompModel(10, value);
    }

    public boolean isHueMod() {
      return this.type == 10;
    }

    public CT_PositivePercentageModel getHueMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSat(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(11, value);
    }

    public boolean isSat() {
      return this.type == 11;
    }

    public CT_PercentageModel getSat() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSatOff(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(12, value);
    }

    public boolean isSatOff() {
      return this.type == 12;
    }

    public CT_PercentageModel getSatOff() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSatMod(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(13, value);
    }

    public boolean isSatMod() {
      return this.type == 13;
    }

    public CT_PercentageModel getSatMod() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLum(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(14, value);
    }

    public boolean isLum() {
      return this.type == 14;
    }

    public CT_PercentageModel getLum() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLumOff(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(15, value);
    }

    public boolean isLumOff() {
      return this.type == 15;
    }

    public CT_PercentageModel getLumOff() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLumMod(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(16, value);
    }

    public boolean isLumMod() {
      return this.type == 16;
    }

    public CT_PercentageModel getLumMod() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRed(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(17, value);
    }

    public boolean isRed() {
      return this.type == 17;
    }

    public CT_PercentageModel getRed() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRedOff(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(18, value);
    }

    public boolean isRedOff() {
      return this.type == 18;
    }

    public CT_PercentageModel getRedOff() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRedMod(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(19, value);
    }

    public boolean isRedMod() {
      return this.type == 19;
    }

    public CT_PercentageModel getRedMod() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreen(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(20, value);
    }

    public boolean isGreen() {
      return this.type == 20;
    }

    public CT_PercentageModel getGreen() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreenOff(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(21, value);
    }

    public boolean isGreenOff() {
      return this.type == 21;
    }

    public CT_PercentageModel getGreenOff() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreenMod(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(22, value);
    }

    public boolean isGreenMod() {
      return this.type == 22;
    }

    public CT_PercentageModel getGreenMod() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlue(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(23, value);
    }

    public boolean isBlue() {
      return this.type == 23;
    }

    public CT_PercentageModel getBlue() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlueOff(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(24, value);
    }

    public boolean isBlueOff() {
      return this.type == 24;
    }

    public CT_PercentageModel getBlueOff() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlueMod(CT_PercentageModel value) {
      return new TintOrShadeOrCompModel(25, value);
    }

    public boolean isBlueMod() {
      return this.type == 25;
    }

    public CT_PercentageModel getBlueMod() {
      return (CT_PercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGamma(CT_GammaTransformModel value) {
      return new TintOrShadeOrCompModel(26, value);
    }

    public boolean isGamma() {
      return this.type == 26;
    }

    public CT_GammaTransformModel getGamma() {
      return (CT_GammaTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newInvGamma(CT_InverseGammaTransformModel value) {
      return new TintOrShadeOrCompModel(27, value);
    }

    public boolean isInvGamma() {
      return this.type == 27;
    }

    public CT_InverseGammaTransformModel getInvGamma() {
      return (CT_InverseGammaTransformModel) this.value;
    }
  }
}
