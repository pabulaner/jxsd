package com.scell.model.drawingml.main;

public class LineEndPropertiesModel {
  private final LineEndTypeModel type;

  private final LineEndWidthModel w;

  private final LineEndLengthModel len;

  public LineEndPropertiesModel(LineEndTypeModel type, LineEndWidthModel w,
      LineEndLengthModel len) {
    this.type = type;
    this.w = w;
    this.len = len;
  }

  public LineEndTypeModel getType() {
    return this.type;
  }

  public LineEndWidthModel getW() {
    return this.w;
  }

  public LineEndLengthModel getLen() {
    return this.len;
  }
}
