package test.drawingml.chart;

import test.XMLSchema.BooleanModel;

public class CTNumFmtModel {
  private final STXstringModel formatCode;

  private final BooleanModel sourceLinked;

  public CTNumFmtModel(STXstringModel formatCode, BooleanModel sourceLinked) {
    this.formatCode = formatCode;
    this.sourceLinked = sourceLinked;
  }

  public STXstringModel getFormatCode() {
    return this.formatCode;
  }

  public BooleanModel getSourceLinked() {
    return this.sourceLinked;
  }
}
