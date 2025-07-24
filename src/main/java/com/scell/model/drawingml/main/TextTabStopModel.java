package com.scell.model.drawingml.main;

public class TextTabStopModel {
  private final Coordinate32Model pos;

  private final TextTabAlignTypeModel algn;

  public TextTabStopModel(Coordinate32Model pos, TextTabAlignTypeModel algn) {
    this.pos = pos;
    this.algn = algn;
  }

  public Coordinate32Model getPos() {
    return this.pos;
  }

  public TextTabAlignTypeModel getAlgn() {
    return this.algn;
  }
}
