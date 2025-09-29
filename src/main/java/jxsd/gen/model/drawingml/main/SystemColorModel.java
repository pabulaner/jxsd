package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.SystemColorBuilder;

/**
 * This is a generated sequence class.
 */
public class SystemColorModel {
  private final SystemColorValValueModel val;

  private final String lastClr;

  private final List<EG_ColorTransform> egColorTransform;

  public SystemColorModel(SystemColorValValueModel val, String lastClr,
      List<EG_ColorTransform> egColorTransform) {
    this.val = val;
    this.lastClr = lastClr;
    this.egColorTransform = egColorTransform;
  }

  public SystemColorBuilder builder() {
    return new SystemColorBuilder().from(this);
  }

  public SystemColorValValueModel getVal() {
    return this.val;
  }

  public String getLastClr() {
    return this.lastClr;
  }

  public List<EG_ColorTransform> getEGColorTransform() {
    return this.egColorTransform;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ColorTransform {
    private final int type;

    private final Object value;

    public EG_ColorTransform() {
      this(-1, null);
    }

    private EG_ColorTransform(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public SystemColorBuilder.EG_ColorTransform builder() {
      return new SystemColorBuilder.EG_ColorTransform().from(this);
    }

    public static EG_ColorTransform newTint(PositiveFixedPercentageModel value) {
      return new EG_ColorTransform(0, value);
    }

    public boolean isTint() {
      return this.type == 0;
    }

    public PositiveFixedPercentageModel getTint() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransform newShade(PositiveFixedPercentageModel value) {
      return new EG_ColorTransform(1, value);
    }

    public boolean isShade() {
      return this.type == 1;
    }

    public PositiveFixedPercentageModel getShade() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransform newComp(ComplementTransformModel value) {
      return new EG_ColorTransform(2, value);
    }

    public boolean isComp() {
      return this.type == 2;
    }

    public ComplementTransformModel getComp() {
      return (ComplementTransformModel) this.value;
    }

    public static EG_ColorTransform newInv(InverseTransformModel value) {
      return new EG_ColorTransform(3, value);
    }

    public boolean isInv() {
      return this.type == 3;
    }

    public InverseTransformModel getInv() {
      return (InverseTransformModel) this.value;
    }

    public static EG_ColorTransform newGray(GrayscaleTransformModel value) {
      return new EG_ColorTransform(4, value);
    }

    public boolean isGray() {
      return this.type == 4;
    }

    public GrayscaleTransformModel getGray() {
      return (GrayscaleTransformModel) this.value;
    }

    public static EG_ColorTransform newAlpha(PositiveFixedPercentageModel value) {
      return new EG_ColorTransform(5, value);
    }

    public boolean isAlpha() {
      return this.type == 5;
    }

    public PositiveFixedPercentageModel getAlpha() {
      return (PositiveFixedPercentageModel) this.value;
    }

    public static EG_ColorTransform newAlphaOff(FixedPercentageModel value) {
      return new EG_ColorTransform(6, value);
    }

    public boolean isAlphaOff() {
      return this.type == 6;
    }

    public FixedPercentageModel getAlphaOff() {
      return (FixedPercentageModel) this.value;
    }

    public static EG_ColorTransform newAlphaMod(PositivePercentageModel value) {
      return new EG_ColorTransform(7, value);
    }

    public boolean isAlphaMod() {
      return this.type == 7;
    }

    public PositivePercentageModel getAlphaMod() {
      return (PositivePercentageModel) this.value;
    }

    public static EG_ColorTransform newHue(PositiveFixedAngleModel value) {
      return new EG_ColorTransform(8, value);
    }

    public boolean isHue() {
      return this.type == 8;
    }

    public PositiveFixedAngleModel getHue() {
      return (PositiveFixedAngleModel) this.value;
    }

    public static EG_ColorTransform newHueOff(AngleModel value) {
      return new EG_ColorTransform(9, value);
    }

    public boolean isHueOff() {
      return this.type == 9;
    }

    public AngleModel getHueOff() {
      return (AngleModel) this.value;
    }

    public static EG_ColorTransform newHueMod(PositivePercentageModel value) {
      return new EG_ColorTransform(10, value);
    }

    public boolean isHueMod() {
      return this.type == 10;
    }

    public PositivePercentageModel getHueMod() {
      return (PositivePercentageModel) this.value;
    }

    public static EG_ColorTransform newSat(PercentageModel value) {
      return new EG_ColorTransform(11, value);
    }

    public boolean isSat() {
      return this.type == 11;
    }

    public PercentageModel getSat() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newSatOff(PercentageModel value) {
      return new EG_ColorTransform(12, value);
    }

    public boolean isSatOff() {
      return this.type == 12;
    }

    public PercentageModel getSatOff() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newSatMod(PercentageModel value) {
      return new EG_ColorTransform(13, value);
    }

    public boolean isSatMod() {
      return this.type == 13;
    }

    public PercentageModel getSatMod() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newLum(PercentageModel value) {
      return new EG_ColorTransform(14, value);
    }

    public boolean isLum() {
      return this.type == 14;
    }

    public PercentageModel getLum() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newLumOff(PercentageModel value) {
      return new EG_ColorTransform(15, value);
    }

    public boolean isLumOff() {
      return this.type == 15;
    }

    public PercentageModel getLumOff() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newLumMod(PercentageModel value) {
      return new EG_ColorTransform(16, value);
    }

    public boolean isLumMod() {
      return this.type == 16;
    }

    public PercentageModel getLumMod() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newRed(PercentageModel value) {
      return new EG_ColorTransform(17, value);
    }

    public boolean isRed() {
      return this.type == 17;
    }

    public PercentageModel getRed() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newRedOff(PercentageModel value) {
      return new EG_ColorTransform(18, value);
    }

    public boolean isRedOff() {
      return this.type == 18;
    }

    public PercentageModel getRedOff() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newRedMod(PercentageModel value) {
      return new EG_ColorTransform(19, value);
    }

    public boolean isRedMod() {
      return this.type == 19;
    }

    public PercentageModel getRedMod() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newGreen(PercentageModel value) {
      return new EG_ColorTransform(20, value);
    }

    public boolean isGreen() {
      return this.type == 20;
    }

    public PercentageModel getGreen() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newGreenOff(PercentageModel value) {
      return new EG_ColorTransform(21, value);
    }

    public boolean isGreenOff() {
      return this.type == 21;
    }

    public PercentageModel getGreenOff() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newGreenMod(PercentageModel value) {
      return new EG_ColorTransform(22, value);
    }

    public boolean isGreenMod() {
      return this.type == 22;
    }

    public PercentageModel getGreenMod() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newBlue(PercentageModel value) {
      return new EG_ColorTransform(23, value);
    }

    public boolean isBlue() {
      return this.type == 23;
    }

    public PercentageModel getBlue() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newBlueOff(PercentageModel value) {
      return new EG_ColorTransform(24, value);
    }

    public boolean isBlueOff() {
      return this.type == 24;
    }

    public PercentageModel getBlueOff() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newBlueMod(PercentageModel value) {
      return new EG_ColorTransform(25, value);
    }

    public boolean isBlueMod() {
      return this.type == 25;
    }

    public PercentageModel getBlueMod() {
      return (PercentageModel) this.value;
    }

    public static EG_ColorTransform newGamma(GammaTransformModel value) {
      return new EG_ColorTransform(26, value);
    }

    public boolean isGamma() {
      return this.type == 26;
    }

    public GammaTransformModel getGamma() {
      return (GammaTransformModel) this.value;
    }

    public static EG_ColorTransform newInvGamma(InverseGammaTransformModel value) {
      return new EG_ColorTransform(27, value);
    }

    public boolean isInvGamma() {
      return this.type == 27;
    }

    public InverseGammaTransformModel getInvGamma() {
      return (InverseGammaTransformModel) this.value;
    }
  }
}
