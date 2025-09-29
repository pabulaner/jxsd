package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.StrValBuilder;

/**
 * This is a generated sequence class.
 */
public class StrValModel {
  private final long idx;

  private final String v;

  public StrValModel(long idx, String v) {
    this.idx = idx;
    this.v = v;
  }

  public StrValBuilder builder() {
    return new StrValBuilder().from(this);
  }

  public long getIdx() {
    return this.idx;
  }

  public String getV() {
    return this.v;
  }
}
