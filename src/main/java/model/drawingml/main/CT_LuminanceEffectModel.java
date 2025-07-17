package model.drawingml.main;

public class CT_LuminanceEffectModel {
  private final ST_FixedPercentageModel contrast;

  private final ST_FixedPercentageModel bright;

  public CT_LuminanceEffectModel(ST_FixedPercentageModel contrast, ST_FixedPercentageModel bright) {
    this.contrast = contrast;
    this.bright = bright;
  }

  public ST_FixedPercentageModel getContrast() {
    return this.contrast;
  }

  public ST_FixedPercentageModel getBright() {
    return this.bright;
  }
}
