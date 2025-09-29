package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.DashStopModel;

/**
 * This is a generated sequence class.
 */
public class DashStopBuilder {
  private int sp;

  private int d;

  public DashStopBuilder() {
  }

  public DashStopBuilder setSp(int sp) {
    this.sp = sp;
    return this;
  }

  public DashStopBuilder setD(int d) {
    this.d = d;
    return this;
  }

  public DashStopBuilder from(DashStopModel value) {
    this.sp = value.getSp();
    this.d = value.getD();
    return this;
  }

  public DashStopModel build() {
    return new DashStopModel(this.sp, this.d);
  }
}
