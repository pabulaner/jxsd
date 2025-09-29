package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RatioModel;

/**
 * This is a generated sequence class.
 */
public class RatioBuilder {
  private long n;

  private long d;

  public RatioBuilder() {
  }

  public RatioBuilder setN(long n) {
    this.n = n;
    return this;
  }

  public RatioBuilder setD(long d) {
    this.d = d;
    return this;
  }

  public RatioBuilder from(RatioModel value) {
    this.n = value.getN();
    this.d = value.getD();
    return this;
  }

  public RatioModel build() {
    return new RatioModel(this.n, this.d);
  }
}
