package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.NumValBuilder;

/**
 * This is a generated sequence class.
 */
public class NumValModel {
  private final String formatCode;

  private final long idx;

  private final String v;

  public NumValModel(String formatCode, long idx, String v) {
    this.formatCode = formatCode;
    this.idx = idx;
    this.v = v;
  }

  public NumValBuilder builder() {
    return new NumValBuilder().from(this);
  }

  public String getFormatCode() {
    return this.formatCode;
  }

  public long getIdx() {
    return this.idx;
  }

  public String getV() {
    return this.v;
  }
}
