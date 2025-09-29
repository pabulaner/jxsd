package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RelativeRectModel;

/**
 * This is a generated sequence class.
 */
public class RelativeRectBuilder {
  private int l;

  private int t;

  private int r;

  private int b;

  public RelativeRectBuilder() {
  }

  public RelativeRectBuilder setL(int l) {
    this.l = l;
    return this;
  }

  public RelativeRectBuilder setT(int t) {
    this.t = t;
    return this;
  }

  public RelativeRectBuilder setR(int r) {
    this.r = r;
    return this;
  }

  public RelativeRectBuilder setB(int b) {
    this.b = b;
    return this;
  }

  public RelativeRectBuilder from(RelativeRectModel value) {
    this.l = value.getL();
    this.t = value.getT();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }

  public RelativeRectModel build() {
    return new RelativeRectModel(this.l, this.t, this.r, this.b);
  }
}
