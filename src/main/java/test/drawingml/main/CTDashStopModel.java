package test.drawingml.main;

public class CTDashStopModel {
  private final STPositivePercentageModel sp;

  private final STPositivePercentageModel d;

  public CTDashStopModel(STPositivePercentageModel sp, STPositivePercentageModel d) {
    this.sp = sp;
    this.d = d;
  }

  public STPositivePercentageModel getSp() {
    return this.sp;
  }

  public STPositivePercentageModel getD() {
    return this.d;
  }
}
