package com.scell.model.drawingml.main;

public class DashStopModel {
  private final PositivePercentageValueModel sp;

  private final PositivePercentageValueModel d;

  public DashStopModel(PositivePercentageValueModel sp, PositivePercentageValueModel d) {
    this.sp = sp;
    this.d = d;
  }

  public PositivePercentageValueModel getSp() {
    return this.sp;
  }

  public PositivePercentageValueModel getD() {
    return this.d;
  }
}
