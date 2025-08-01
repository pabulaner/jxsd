package com.scell.model.drawingml.main;

public class TextTabStopModel {
  private final Coordinate32ValueModel pos;

  private final TextTabAlignTypeValueModel algn;

  public TextTabStopModel(Coordinate32ValueModel pos, TextTabAlignTypeValueModel algn) {
    this.pos = pos;
    this.algn = algn;
  }

  public Coordinate32ValueModel getPos() {
    return this.pos;
  }

  public TextTabAlignTypeValueModel getAlgn() {
    return this.algn;
  }
}
