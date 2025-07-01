package test.drawingml.main;

public class CTTintEffectModel {
  private final STPositiveFixedAngleModel hue;

  private final STFixedPercentageModel amt;

  public CTTintEffectModel(STPositiveFixedAngleModel hue, STFixedPercentageModel amt) {
    this.hue = hue;
    this.amt = amt;
  }

  public STPositiveFixedAngleModel getHue() {
    return this.hue;
  }

  public STFixedPercentageModel getAmt() {
    return this.amt;
  }
}
