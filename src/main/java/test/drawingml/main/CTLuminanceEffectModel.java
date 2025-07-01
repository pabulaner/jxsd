package test.drawingml.main;

public class CTLuminanceEffectModel {
  private final STFixedPercentageModel contrast;

  private final STFixedPercentageModel bright;

  public CTLuminanceEffectModel(STFixedPercentageModel contrast, STFixedPercentageModel bright) {
    this.contrast = contrast;
    this.bright = bright;
  }

  public STFixedPercentageModel getContrast() {
    return this.contrast;
  }

  public STFixedPercentageModel getBright() {
    return this.bright;
  }
}
