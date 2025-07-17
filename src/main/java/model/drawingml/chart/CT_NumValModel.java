package model.drawingml.chart;

import model.XMLSchema.unsignedIntModel;

public class CT_NumValModel {
  private final ST_XstringModel formatCode;

  private final unsignedIntModel idx;

  private final ST_XstringModel v;

  public CT_NumValModel(ST_XstringModel formatCode, unsignedIntModel idx, ST_XstringModel v) {
    this.formatCode = formatCode;
    this.idx = idx;
    this.v = v;
  }

  public ST_XstringModel getFormatCode() {
    return this.formatCode;
  }

  public unsignedIntModel getIdx() {
    return this.idx;
  }

  public ST_XstringModel getV() {
    return this.v;
  }
}
