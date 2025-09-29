package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.RatioBuilder;

/**
 * This is a generated sequence class.
 */
public class RatioModel {
  private final long n;

  private final long d;

  public RatioModel(long n, long d) {
    this.n = n;
    this.d = d;
  }

  public RatioBuilder builder() {
    return new RatioBuilder().from(this);
  }

  public long getN() {
    return this.n;
  }

  public long getD() {
    return this.d;
  }
}
