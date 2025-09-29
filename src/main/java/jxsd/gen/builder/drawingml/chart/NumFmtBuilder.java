package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.NumFmtModel;

/**
 * This is a generated sequence class.
 */
public class NumFmtBuilder {
  private String formatCode;

  private boolean sourceLinked;

  public NumFmtBuilder() {
  }

  public NumFmtBuilder setFormatCode(String formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumFmtBuilder setSourceLinked(boolean sourceLinked) {
    this.sourceLinked = sourceLinked;
    return this;
  }

  public NumFmtBuilder from(NumFmtModel value) {
    this.formatCode = value.getFormatCode();
    this.sourceLinked = value.getSourceLinked();
    return this;
  }

  public NumFmtModel build() {
    return new NumFmtModel(this.formatCode, this.sourceLinked);
  }
}
