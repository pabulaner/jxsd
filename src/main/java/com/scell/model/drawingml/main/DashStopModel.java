package com.scell.model.drawingml.main;

public class DashStopModel {
  private final PositivePercentageModel sp;

  private final PositivePercentageModel d;

  public DashStopModel(PositivePercentageModel sp, PositivePercentageModel d) {
    this.sp = sp;
    this.d = d;
  }

  public PositivePercentageModel getSp() {
    return this.sp;
  }

  public PositivePercentageModel getD() {
    return this.d;
  }
}
