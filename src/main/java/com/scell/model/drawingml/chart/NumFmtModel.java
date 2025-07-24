package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;

public class NumFmtModel {
  private final XstringModel formatCode;

  private final BooleanModel sourceLinked;

  public NumFmtModel(XstringModel formatCode, BooleanModel sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public XstringModel getFormatCode() {
    return this.formatCode;
  }

  public BooleanModel getSourceLinked() {
    return this.sourceLinked;
  }
}
