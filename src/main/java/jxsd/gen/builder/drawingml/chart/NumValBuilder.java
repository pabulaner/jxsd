package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.NumValModel;

/**
 * This is a generated sequence class.
 */
public class NumValBuilder {
  private String formatCode;

  private long idx;

  private String v;

  public NumValBuilder() {
  }

  public NumValBuilder setFormatCode(String formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumValBuilder setIdx(long idx) {
    this.idx = idx;
    return this;
  }

  public NumValBuilder setV(String v) {
    this.v = v;
    return this;
  }

  public NumValBuilder from(NumValModel value) {
    this.formatCode = value.getFormatCode();
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }

  public NumValModel build() {
    return new NumValModel(this.formatCode, this.idx, this.v);
  }
}
