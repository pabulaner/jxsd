package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_DashStopModel;
import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class CT_DashStopBuilder {
  private ST_PositivePercentageModel sp;

  private ST_PositivePercentageModel d;

  public CT_DashStopBuilder() {
  }

  public CT_DashStopBuilder setSp(ST_PositivePercentageModel sp) {
    this.sp = sp;
    return this;
  }

  public CT_DashStopBuilder setD(ST_PositivePercentageModel d) {
    this.d = d;
    return this;
  }

  public CT_DashStopModel build() {
    return new CT_DashStopModel(this.sp, this.d);
  }

  public CT_DashStopBuilder from(CT_DashStopModel value) {
    this.sp = value.getSp();
    this.d = value.getD();
    return this;
  }
}
