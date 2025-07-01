package test.drawingml.chart;

import test.XMLSchema.UnsignedIntModel;

public class CTNumValModel {
  private final STXstringModel formatCode;

  private final UnsignedIntModel idx;

  private final STXstringModel v;

  public CTNumValModel(STXstringModel formatCode, UnsignedIntModel idx, STXstringModel v) {
    this.formatCode = formatCode;
    this.idx = idx;
    this.v = v;
  }

  public STXstringModel getFormatCode() {
    return this.formatCode;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public STXstringModel getV() {
    return this.v;
  }
}
