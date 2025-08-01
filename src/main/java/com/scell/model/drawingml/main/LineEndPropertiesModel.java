package com.scell.model.drawingml.main;

public class LineEndPropertiesModel {
  private final LineEndTypeValueModel type;

  private final LineEndWidthValueModel w;

  private final LineEndLengthValueModel len;

  public LineEndPropertiesModel(LineEndTypeValueModel type, LineEndWidthValueModel w,
      LineEndLengthValueModel len) {
    this.type = type;
    this.w = w;
    this.len = len;
  }

  public LineEndTypeValueModel getType() {
    return this.type;
  }

  public LineEndWidthValueModel getW() {
    return this.w;
  }

  public LineEndLengthValueModel getLen() {
    return this.len;
  }
}
