package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DashStopModel;
import com.scell.model.drawingml.main.PositivePercentageModel;

public class DashStopBuilder {
  private PositivePercentageModel sp;

  private PositivePercentageModel d;

  public DashStopBuilder() {
  }

  public DashStopBuilder setSp(PositivePercentageModel sp) {
    this.sp = sp;
    return this;
  }

  public DashStopBuilder setD(PositivePercentageModel d) {
    this.d = d;
    return this;
  }

  public DashStopModel build() {
    return new DashStopModel(this.sp, this.d);
  }

  public DashStopBuilder from(DashStopModel value) {
    this.sp = value.getSp();
    this.d = value.getD();
    return this;
  }
}
