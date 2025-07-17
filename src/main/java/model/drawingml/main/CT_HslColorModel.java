package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_HslColorModel {
  private final ST_PositiveFixedAngleModel hue;

  private final ST_PercentageModel lum;

  private final ST_PercentageModel sat;

  private final List<tintOrShadeOrCompModel> tintOrShadeOrComp;

  public CT_HslColorModel(ST_PositiveFixedAngleModel hue, ST_PercentageModel lum,
      ST_PercentageModel sat, List<tintOrShadeOrCompModel> tintOrShadeOrComp) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
    this.tintOrShadeOrComp = tintOrShadeOrComp;
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

  public List<tintOrShadeOrCompModel> getTintOrShadeOrComp() {
    return this.tintOrShadeOrComp;
  }

  public static class tintOrShadeOrCompModel {
    private final int type;

    private final Object value;

    public tintOrShadeOrCompModel() {
      this(-1, null);
    }

    private tintOrShadeOrCompModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static tintOrShadeOrCompModel newTint(CT_PositiveFixedPercentageModel value) {
      return new tintOrShadeOrCompModel(0, value);
    }

    public boolean isTint() {
      return this.type == 0;
    }

    public CT_PositiveFixedPercentageModel getTint() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newShade(CT_PositiveFixedPercentageModel value) {
      return new tintOrShadeOrCompModel(1, value);
    }

    public boolean isShade() {
      return this.type == 1;
    }

    public CT_PositiveFixedPercentageModel getShade() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newComp(CT_ComplementTransformModel value) {
      return new tintOrShadeOrCompModel(2, value);
    }

    public boolean isComp() {
      return this.type == 2;
    }

    public CT_ComplementTransformModel getComp() {
      return (CT_ComplementTransformModel) this.value;
    }

    public static tintOrShadeOrCompModel newInv(CT_InverseTransformModel value) {
      return new tintOrShadeOrCompModel(3, value);
    }

    public boolean isInv() {
      return this.type == 3;
    }

    public CT_InverseTransformModel getInv() {
      return (CT_InverseTransformModel) this.value;
    }

    public static tintOrShadeOrCompModel newGray(CT_GrayscaleTransformModel value) {
      return new tintOrShadeOrCompModel(4, value);
    }

    public boolean isGray() {
      return this.type == 4;
    }

    public CT_GrayscaleTransformModel getGray() {
      return (CT_GrayscaleTransformModel) this.value;
    }

    public static tintOrShadeOrCompModel newAlpha(CT_PositiveFixedPercentageModel value) {
      return new tintOrShadeOrCompModel(5, value);
    }

    public boolean isAlpha() {
      return this.type == 5;
    }

    public CT_PositiveFixedPercentageModel getAlpha() {
      return (CT_PositiveFixedPercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newAlphaOff(CT_FixedPercentageModel value) {
      return new tintOrShadeOrCompModel(6, value);
    }

    public boolean isAlphaOff() {
      return this.type == 6;
    }

    public CT_FixedPercentageModel getAlphaOff() {
      return (CT_FixedPercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newAlphaMod(CT_PositivePercentageModel value) {
      return new tintOrShadeOrCompModel(7, value);
    }

    public boolean isAlphaMod() {
      return this.type == 7;
    }

    public CT_PositivePercentageModel getAlphaMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newHue(CT_PositiveFixedAngleModel value) {
      return new tintOrShadeOrCompModel(8, value);
    }

    public boolean isHue() {
      return this.type == 8;
    }

    public CT_PositiveFixedAngleModel getHue() {
      return (CT_PositiveFixedAngleModel) this.value;
    }

    public static tintOrShadeOrCompModel newHueOff(CT_AngleModel value) {
      return new tintOrShadeOrCompModel(9, value);
    }

    public boolean isHueOff() {
      return this.type == 9;
    }

    public CT_AngleModel getHueOff() {
      return (CT_AngleModel) this.value;
    }

    public static tintOrShadeOrCompModel newHueMod(CT_PositivePercentageModel value) {
      return new tintOrShadeOrCompModel(10, value);
    }

    public boolean isHueMod() {
      return this.type == 10;
    }

    public CT_PositivePercentageModel getHueMod() {
      return (CT_PositivePercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newSat(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(11, value);
    }

    public boolean isSat() {
      return this.type == 11;
    }

    public CT_PercentageModel getSat() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newSatOff(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(12, value);
    }

    public boolean isSatOff() {
      return this.type == 12;
    }

    public CT_PercentageModel getSatOff() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newSatMod(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(13, value);
    }

    public boolean isSatMod() {
      return this.type == 13;
    }

    public CT_PercentageModel getSatMod() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newLum(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(14, value);
    }

    public boolean isLum() {
      return this.type == 14;
    }

    public CT_PercentageModel getLum() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newLumOff(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(15, value);
    }

    public boolean isLumOff() {
      return this.type == 15;
    }

    public CT_PercentageModel getLumOff() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newLumMod(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(16, value);
    }

    public boolean isLumMod() {
      return this.type == 16;
    }

    public CT_PercentageModel getLumMod() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newRed(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(17, value);
    }

    public boolean isRed() {
      return this.type == 17;
    }

    public CT_PercentageModel getRed() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newRedOff(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(18, value);
    }

    public boolean isRedOff() {
      return this.type == 18;
    }

    public CT_PercentageModel getRedOff() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newRedMod(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(19, value);
    }

    public boolean isRedMod() {
      return this.type == 19;
    }

    public CT_PercentageModel getRedMod() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newGreen(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(20, value);
    }

    public boolean isGreen() {
      return this.type == 20;
    }

    public CT_PercentageModel getGreen() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newGreenOff(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(21, value);
    }

    public boolean isGreenOff() {
      return this.type == 21;
    }

    public CT_PercentageModel getGreenOff() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newGreenMod(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(22, value);
    }

    public boolean isGreenMod() {
      return this.type == 22;
    }

    public CT_PercentageModel getGreenMod() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newBlue(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(23, value);
    }

    public boolean isBlue() {
      return this.type == 23;
    }

    public CT_PercentageModel getBlue() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newBlueOff(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(24, value);
    }

    public boolean isBlueOff() {
      return this.type == 24;
    }

    public CT_PercentageModel getBlueOff() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newBlueMod(CT_PercentageModel value) {
      return new tintOrShadeOrCompModel(25, value);
    }

    public boolean isBlueMod() {
      return this.type == 25;
    }

    public CT_PercentageModel getBlueMod() {
      return (CT_PercentageModel) this.value;
    }

    public static tintOrShadeOrCompModel newGamma(CT_GammaTransformModel value) {
      return new tintOrShadeOrCompModel(26, value);
    }

    public boolean isGamma() {
      return this.type == 26;
    }

    public CT_GammaTransformModel getGamma() {
      return (CT_GammaTransformModel) this.value;
    }

    public static tintOrShadeOrCompModel newInvGamma(CT_InverseGammaTransformModel value) {
      return new tintOrShadeOrCompModel(27, value);
    }

    public boolean isInvGamma() {
      return this.type == 27;
    }

    public CT_InverseGammaTransformModel getInvGamma() {
      return (CT_InverseGammaTransformModel) this.value;
    }
  }
}
