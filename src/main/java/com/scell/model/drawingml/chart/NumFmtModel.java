package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;

public class NumFmtModel {
  private final XstringValueModel formatCode;

  private final BooleanValueModel sourceLinked;

  public NumFmtModel(XstringValueModel formatCode, BooleanValueModel sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public XstringValueModel getFormatCode() {
    return this.formatCode;
  }

  public BooleanValueModel getSourceLinked() {
    return this.sourceLinked;
  }
}
