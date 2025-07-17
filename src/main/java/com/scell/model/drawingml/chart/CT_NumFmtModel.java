package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;

public class CT_NumFmtModel {
  private final ST_XstringModel formatCode;

  private final BooleanModel sourceLinked;

  public CT_NumFmtModel(ST_XstringModel formatCode, BooleanModel sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public ST_XstringModel getFormatCode() {
    return this.formatCode;
  }

  public BooleanModel getSourceLinked() {
    return this.sourceLinked;
  }
}
