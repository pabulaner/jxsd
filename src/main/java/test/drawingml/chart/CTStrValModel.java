package test.drawingml.chart;

import test.XMLSchema.UnsignedIntModel;

public class CTStrValModel {
  private final UnsignedIntModel idx;

  private final STXstringModel v;

  public CTStrValModel(UnsignedIntModel idx, STXstringModel v) {
    this.idx = idx;
    this.v = v;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public STXstringModel getV() {
    return this.v;
  }
}
