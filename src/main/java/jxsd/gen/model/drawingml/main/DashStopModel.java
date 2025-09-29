package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.DashStopBuilder;

/**
 * This is a generated sequence class.
 */
public class DashStopModel {
  private final int sp;

  private final int d;

  public DashStopModel(int sp, int d) {
    this.sp = sp;
    this.d = d;
  }

  public DashStopBuilder builder() {
    return new DashStopBuilder().from(this);
  }

  public int getSp() {
    return this.sp;
  }

  public int getD() {
    return this.d;
  }
}
