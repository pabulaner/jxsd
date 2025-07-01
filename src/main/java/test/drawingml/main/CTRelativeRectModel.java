package test.drawingml.main;

public class CTRelativeRectModel {
  private final STPercentageModel l;

  private final STPercentageModel t;

  private final STPercentageModel r;

  private final STPercentageModel b;

  public CTRelativeRectModel(STPercentageModel l, STPercentageModel t, STPercentageModel r,
      STPercentageModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public STPercentageModel getL() {
    return this.l;
  }

  public STPercentageModel getT() {
    return this.t;
  }

  public STPercentageModel getR() {
    return this.r;
  }

  public STPercentageModel getB() {
    return this.b;
  }
}
