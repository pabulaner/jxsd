package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.RelativeRectBuilder;

/**
 * This is a generated sequence class.
 */
public class RelativeRectModel {
  private final int l;

  private final int t;

  private final int r;

  private final int b;

  public RelativeRectModel(int l, int t, int r, int b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public RelativeRectBuilder builder() {
    return new RelativeRectBuilder().from(this);
  }

  public int getL() {
    return this.l;
  }

  public int getT() {
    return this.t;
  }

  public int getR() {
    return this.r;
  }

  public int getB() {
    return this.b;
  }
}
