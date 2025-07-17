package model.drawingml.chart;

import model.XMLSchema.booleanModel;

public class CT_NumFmtModel {
  private final ST_XstringModel formatCode;

  private final booleanModel sourceLinked;

  public CT_NumFmtModel(ST_XstringModel formatCode, booleanModel sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public ST_XstringModel getFormatCode() {
    return this.formatCode;
  }

  public booleanModel getSourceLinked() {
    return this.sourceLinked;
  }
}
