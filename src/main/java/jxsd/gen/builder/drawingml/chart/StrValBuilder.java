package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.StrValModel;

/**
 * This is a generated sequence class.
 */
public class StrValBuilder {
  private long idx;

  private String v;

  public StrValBuilder() {
  }

  public StrValBuilder setIdx(long idx) {
    this.idx = idx;
    return this;
  }

  public StrValBuilder setV(String v) {
    this.v = v;
    return this;
  }

  public StrValBuilder from(StrValModel value) {
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }

  public StrValModel build() {
    return new StrValModel(this.idx, this.v);
  }
}
