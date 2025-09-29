package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.NumFmtBuilder;

/**
 * This is a generated sequence class.
 */
public class NumFmtModel {
  private final String formatCode;

  private final boolean sourceLinked;

  public NumFmtModel(String formatCode, boolean sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public NumFmtBuilder builder() {
    return new NumFmtBuilder().from(this);
  }

  public String getFormatCode() {
    return this.formatCode;
  }

  public boolean getSourceLinked() {
    return this.sourceLinked;
  }
}
