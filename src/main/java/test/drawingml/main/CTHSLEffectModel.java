package test.drawingml.main;

public class CTHSLEffectModel {
  private final STPositiveFixedAngleModel hue;

  private final STFixedPercentageModel lum;

  private final STFixedPercentageModel sat;

  public CTHSLEffectModel(STPositiveFixedAngleModel hue, STFixedPercentageModel lum,
      STFixedPercentageModel sat) {
    this.hue = hue;
    this.lum = lum;
    this.sat = sat;
  }

  public STPositiveFixedAngleModel getHue() {
    return this.hue;
  }

  public STFixedPercentageModel getLum() {
    return this.lum;
  }

  public STFixedPercentageModel getSat() {
    return this.sat;
  }
}
