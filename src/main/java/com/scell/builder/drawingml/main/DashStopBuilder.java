package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DashStopModel;
import com.scell.model.drawingml.main.PositivePercentageValueModel;

public class DashStopBuilder {
  private PositivePercentageValueModel sp;

  private PositivePercentageValueModel d;

  public DashStopBuilder() {
  }

  public DashStopBuilder setSp(PositivePercentageValueModel sp) {
    this.sp = sp;
    return this;
  }

  public DashStopBuilder setD(PositivePercentageValueModel d) {
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
