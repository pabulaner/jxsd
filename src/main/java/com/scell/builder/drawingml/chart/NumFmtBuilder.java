package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.chart.XstringValueModel;

public class NumFmtBuilder {
  private XstringValueModel formatCode;

  private BooleanValueModel sourceLinked;

  public NumFmtBuilder() {
  }

  public NumFmtBuilder setFormatCode(XstringValueModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumFmtBuilder setSourceLinked(BooleanValueModel sourceLinked) {
    this.sourceLinked = sourceLinked;
    return this;
  }

  public NumFmtModel build() {
    return new NumFmtModel(this.formatCode, this.sourceLinked);
  }

  public NumFmtBuilder from(NumFmtModel value) {
    this.formatCode = value.getFormatCode();
    this.sourceLinked = value.getSourceLinked();
    return this;
  }
}
