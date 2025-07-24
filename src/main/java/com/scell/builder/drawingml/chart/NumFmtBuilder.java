package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.chart.XstringModel;

public class NumFmtBuilder {
  private XstringModel formatCode;

  private BooleanModel sourceLinked;

  public NumFmtBuilder() {
  }

  public NumFmtBuilder setFormatCode(XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumFmtBuilder setSourceLinked(BooleanModel sourceLinked) {
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
