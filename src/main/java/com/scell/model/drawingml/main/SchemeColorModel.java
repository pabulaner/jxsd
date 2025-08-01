package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class SchemeColorModel {
  private final SchemeColorValValueModel val;

  private final List<ColorTransformModel> egColorTransform;

  public SchemeColorModel(SchemeColorValValueModel val,
      List<ColorTransformModel> egColorTransform) {
    this.val = val;
    this.egColorTransform = egColorTransform;
  }

  public SchemeColorValValueModel getVal() {
    return this.val;
  }

  public List<ColorTransformModel> getEGColorTransform() {
    return this.egColorTransform;
  }

  public static class ColorTransformModel {
    private final int type;

    private final Object value;

    public ColorTransformModel() {
      this(-1, null);
    }

    private ColorTransformModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ColorTransformModel newTint(PositiveFixedPercentageModel value) {
      return new ColorTransformModel(0, value);
    }

    public boolean isTint() {
      return this.type == 0;
    }

    public PositiveFixedPercentageModel getTint() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static ColorTransformModel newShade(PositiveFixedPercentageModel value) {
      return new ColorTransformModel(1, value);
    }

    public boolean isShade() {
      return this.type == 1;
    }

    public PositiveFixedPercentageModel getShade() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static ColorTransformModel newComp(ComplementTransformModel value) {
      return new ColorTransformModel(2, value);
    }

    public boolean isComp() {
      return this.type == 2;
    }

    public ComplementTransformModel getComp() {
      return (ComplementTransformModel) this.value;
    }

    public static ColorTransformModel newInv(InverseTransformModel value) {
      return new ColorTransformModel(3, value);
    }

    public boolean isInv() {
      return this.type == 3;
    }

    public InverseTransformModel getInv() {
      return (InverseTransformModel) this.value;
    }

    public static ColorTransformModel newGray(GrayscaleTransformModel value) {
      return new ColorTransformModel(4, value);
    }

    public boolean isGray() {
      return this.type == 4;
    }

    public GrayscaleTransformModel getGray() {
      return (GrayscaleTransformModel) this.value;
    }

    public static ColorTransformModel newAlpha(PositiveFixedPercentageModel value) {
      return new ColorTransformModel(5, value);
    }

    public boolean isAlpha() {
      return this.type == 5;
    }

    public PositiveFixedPercentageModel getAlpha() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static ColorTransformModel newAlphaOff(FixedPercentageModel value) {
      return new ColorTransformModel(6, value);
    }

    public boolean isAlphaOff() {
      return this.type == 6;
    }

    public FixedPercentageModel getAlphaOff() {
      return (FixedPercentageModel) this.value;
    }

    public static ColorTransformModel newAlphaMod(PositivePercentageModel value) {
      return new ColorTransformModel(7, value);
    }

    public boolean isAlphaMod() {
      return this.type == 7;
    }

    public PositivePercentageModel getAlphaMod() {
      return (PositivePercentageModel) this.value;
    }

    public static ColorTransformModel newHue(PositiveFixedAngleModel value) {
      return new ColorTransformModel(8, value);
    }

    public boolean isHue() {
      return this.type == 8;
    }

    public PositiveFixedAngleModel getHue() {
      return (PositiveFixedAngleModel) this.value;
    }

    public static ColorTransformModel newHueOff(AngleModel value) {
      return new ColorTransformModel(9, value);
    }

    public boolean isHueOff() {
      return this.type == 9;
    }

    public AngleModel getHueOff() {
      return (AngleModel) this.value;
    }

    public static ColorTransformModel newHueMod(PositivePercentageModel value) {
      return new ColorTransformModel(10, value);
    }

    public boolean isHueMod() {
      return this.type == 10;
    }

    public PositivePercentageModel getHueMod() {
      return (PositivePercentageModel) this.value;
    }

    public static ColorTransformModel newSat(PercentageModel value) {
      return new ColorTransformModel(11, value);
    }

    public boolean isSat() {
      return this.type == 11;
    }

    public PercentageModel getSat() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newSatOff(PercentageModel value) {
      return new ColorTransformModel(12, value);
    }

    public boolean isSatOff() {
      return this.type == 12;
    }

    public PercentageModel getSatOff() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newSatMod(PercentageModel value) {
      return new ColorTransformModel(13, value);
    }

    public boolean isSatMod() {
      return this.type == 13;
    }

    public PercentageModel getSatMod() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newLum(PercentageModel value) {
      return new ColorTransformModel(14, value);
    }

    public boolean isLum() {
      return this.type == 14;
    }

    public PercentageModel getLum() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newLumOff(PercentageModel value) {
      return new ColorTransformModel(15, value);
    }

    public boolean isLumOff() {
      return this.type == 15;
    }

    public PercentageModel getLumOff() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newLumMod(PercentageModel value) {
      return new ColorTransformModel(16, value);
    }

    public boolean isLumMod() {
      return this.type == 16;
    }

    public PercentageModel getLumMod() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newRed(PercentageModel value) {
      return new ColorTransformModel(17, value);
    }

    public boolean isRed() {
      return this.type == 17;
    }

    public PercentageModel getRed() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newRedOff(PercentageModel value) {
      return new ColorTransformModel(18, value);
    }

    public boolean isRedOff() {
      return this.type == 18;
    }

    public PercentageModel getRedOff() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newRedMod(PercentageModel value) {
      return new ColorTransformModel(19, value);
    }

    public boolean isRedMod() {
      return this.type == 19;
    }

    public PercentageModel getRedMod() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newGreen(PercentageModel value) {
      return new ColorTransformModel(20, value);
    }

    public boolean isGreen() {
      return this.type == 20;
    }

    public PercentageModel getGreen() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newGreenOff(PercentageModel value) {
      return new ColorTransformModel(21, value);
    }

    public boolean isGreenOff() {
      return this.type == 21;
    }

    public PercentageModel getGreenOff() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newGreenMod(PercentageModel value) {
      return new ColorTransformModel(22, value);
    }

    public boolean isGreenMod() {
      return this.type == 22;
    }

    public PercentageModel getGreenMod() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newBlue(PercentageModel value) {
      return new ColorTransformModel(23, value);
    }

    public boolean isBlue() {
      return this.type == 23;
    }

    public PercentageModel getBlue() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newBlueOff(PercentageModel value) {
      return new ColorTransformModel(24, value);
    }

    public boolean isBlueOff() {
      return this.type == 24;
    }

    public PercentageModel getBlueOff() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newBlueMod(PercentageModel value) {
      return new ColorTransformModel(25, value);
    }

    public boolean isBlueMod() {
      return this.type == 25;
    }

    public PercentageModel getBlueMod() {
      return (PercentageModel) this.value;
    }

    public static ColorTransformModel newGamma(GammaTransformModel value) {
      return new ColorTransformModel(26, value);
    }

    public boolean isGamma() {
      return this.type == 26;
    }

    public GammaTransformModel getGamma() {
      return (GammaTransformModel) this.value;
    }

    public static ColorTransformModel newInvGamma(InverseGammaTransformModel value) {
      return new ColorTransformModel(27, value);
    }

    public boolean isInvGamma() {
      return this.type == 27;
    }

    public InverseGammaTransformModel getInvGamma() {
      return (InverseGammaTransformModel) this.value;
    }
  }
}
