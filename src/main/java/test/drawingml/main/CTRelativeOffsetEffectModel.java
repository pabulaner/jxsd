package test.drawingml.main;

public class CTRelativeOffsetEffectModel {
  private final STPercentageModel ty;

  private final STPercentageModel tx;

  public CTRelativeOffsetEffectModel(STPercentageModel ty, STPercentageModel tx) {
    this.ty = ty;
    this.tx = tx;
  }

  public STPercentageModel getTy() {
    return this.ty;
  }

  public STPercentageModel getTx() {
    return this.tx;
  }
}
