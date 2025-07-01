package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTSchemeColorModel {
  private final STSchemeColorValModel val;

  private final TintOrShadeOrCompModel tintOrShadeOrComp;

  public CTSchemeColorModel(STSchemeColorValModel val, TintOrShadeOrCompModel tintOrShadeOrComp) {
    this.val = val;
    this.tintOrShadeOrComp = tintOrShadeOrComp;
  }

  public STSchemeColorValModel getVal() {
    return this.val;
  }

  public TintOrShadeOrCompModel getTintOrShadeOrComp() {
    return this.tintOrShadeOrComp;
  }

  public static class TintOrShadeOrCompModel {
    private final Integer type;

    private final Object value;

    public TintOrShadeOrCompModel() {
      this(-1, null);
    }

    private TintOrShadeOrCompModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TintOrShadeOrCompModel newTint(CTPositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(0, value);
    }

    public Boolean isTint() {
      return this.type == 0;
    }

    public CTPositiveFixedPercentageModel getTint() {
      return (CTPositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newShade(CTPositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(1, value);
    }

    public Boolean isShade() {
      return this.type == 1;
    }

    public CTPositiveFixedPercentageModel getShade() {
      return (CTPositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newComp(CTComplementTransformModel value) {
      return new TintOrShadeOrCompModel(2, value);
    }

    public Boolean isComp() {
      return this.type == 2;
    }

    public CTComplementTransformModel getComp() {
      return (CTComplementTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newInv(CTInverseTransformModel value) {
      return new TintOrShadeOrCompModel(3, value);
    }

    public Boolean isInv() {
      return this.type == 3;
    }

    public CTInverseTransformModel getInv() {
      return (CTInverseTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newGray(CTGrayscaleTransformModel value) {
      return new TintOrShadeOrCompModel(4, value);
    }

    public Boolean isGray() {
      return this.type == 4;
    }

    public CTGrayscaleTransformModel getGray() {
      return (CTGrayscaleTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlpha(CTPositiveFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(5, value);
    }

    public Boolean isAlpha() {
      return this.type == 5;
    }

    public CTPositiveFixedPercentageModel getAlpha() {
      return (CTPositiveFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlphaOff(CTFixedPercentageModel value) {
      return new TintOrShadeOrCompModel(6, value);
    }

    public Boolean isAlphaOff() {
      return this.type == 6;
    }

    public CTFixedPercentageModel getAlphaOff() {
      return (CTFixedPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newAlphaMod(CTPositivePercentageModel value) {
      return new TintOrShadeOrCompModel(7, value);
    }

    public Boolean isAlphaMod() {
      return this.type == 7;
    }

    public CTPositivePercentageModel getAlphaMod() {
      return (CTPositivePercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newHue(CTPositiveFixedAngleModel value) {
      return new TintOrShadeOrCompModel(8, value);
    }

    public Boolean isHue() {
      return this.type == 8;
    }

    public CTPositiveFixedAngleModel getHue() {
      return (CTPositiveFixedAngleModel) this.value;
    }

    public static TintOrShadeOrCompModel newHueOff(CTAngleModel value) {
      return new TintOrShadeOrCompModel(9, value);
    }

    public Boolean isHueOff() {
      return this.type == 9;
    }

    public CTAngleModel getHueOff() {
      return (CTAngleModel) this.value;
    }

    public static TintOrShadeOrCompModel newHueMod(CTPositivePercentageModel value) {
      return new TintOrShadeOrCompModel(10, value);
    }

    public Boolean isHueMod() {
      return this.type == 10;
    }

    public CTPositivePercentageModel getHueMod() {
      return (CTPositivePercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSat(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(11, value);
    }

    public Boolean isSat() {
      return this.type == 11;
    }

    public CTPercentageModel getSat() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSatOff(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(12, value);
    }

    public Boolean isSatOff() {
      return this.type == 12;
    }

    public CTPercentageModel getSatOff() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newSatMod(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(13, value);
    }

    public Boolean isSatMod() {
      return this.type == 13;
    }

    public CTPercentageModel getSatMod() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLum(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(14, value);
    }

    public Boolean isLum() {
      return this.type == 14;
    }

    public CTPercentageModel getLum() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLumOff(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(15, value);
    }

    public Boolean isLumOff() {
      return this.type == 15;
    }

    public CTPercentageModel getLumOff() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newLumMod(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(16, value);
    }

    public Boolean isLumMod() {
      return this.type == 16;
    }

    public CTPercentageModel getLumMod() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRed(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(17, value);
    }

    public Boolean isRed() {
      return this.type == 17;
    }

    public CTPercentageModel getRed() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRedOff(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(18, value);
    }

    public Boolean isRedOff() {
      return this.type == 18;
    }

    public CTPercentageModel getRedOff() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newRedMod(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(19, value);
    }

    public Boolean isRedMod() {
      return this.type == 19;
    }

    public CTPercentageModel getRedMod() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreen(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(20, value);
    }

    public Boolean isGreen() {
      return this.type == 20;
    }

    public CTPercentageModel getGreen() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreenOff(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(21, value);
    }

    public Boolean isGreenOff() {
      return this.type == 21;
    }

    public CTPercentageModel getGreenOff() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGreenMod(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(22, value);
    }

    public Boolean isGreenMod() {
      return this.type == 22;
    }

    public CTPercentageModel getGreenMod() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlue(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(23, value);
    }

    public Boolean isBlue() {
      return this.type == 23;
    }

    public CTPercentageModel getBlue() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlueOff(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(24, value);
    }

    public Boolean isBlueOff() {
      return this.type == 24;
    }

    public CTPercentageModel getBlueOff() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newBlueMod(CTPercentageModel value) {
      return new TintOrShadeOrCompModel(25, value);
    }

    public Boolean isBlueMod() {
      return this.type == 25;
    }

    public CTPercentageModel getBlueMod() {
      return (CTPercentageModel) this.value;
    }

    public static TintOrShadeOrCompModel newGamma(CTGammaTransformModel value) {
      return new TintOrShadeOrCompModel(26, value);
    }

    public Boolean isGamma() {
      return this.type == 26;
    }

    public CTGammaTransformModel getGamma() {
      return (CTGammaTransformModel) this.value;
    }

    public static TintOrShadeOrCompModel newInvGamma(CTInverseGammaTransformModel value) {
      return new TintOrShadeOrCompModel(27, value);
    }

    public Boolean isInvGamma() {
      return this.type == 27;
    }

    public CTInverseGammaTransformModel getInvGamma() {
      return (CTInverseGammaTransformModel) this.value;
    }
  }
}
