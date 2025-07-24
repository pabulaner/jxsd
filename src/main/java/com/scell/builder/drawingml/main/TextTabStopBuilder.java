package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32Model;
import com.scell.model.drawingml.main.TextTabAlignTypeModel;
import com.scell.model.drawingml.main.TextTabStopModel;

public class TextTabStopBuilder {
  private Coordinate32Model pos;

  private TextTabAlignTypeModel algn;

  public TextTabStopBuilder() {
  }

  public TextTabStopBuilder setPos(Coordinate32Model pos) {
    this.pos = pos;
    return this;
  }

  public TextTabStopBuilder setAlgn(TextTabAlignTypeModel algn) {
    this.algn = algn;
    return this;
  }

  public TextTabStopModel build() {
    return new TextTabStopModel(this.pos, this.algn);
  }

  public TextTabStopBuilder from(TextTabStopModel value) {
    this.pos = value.getPos();
    this.algn = value.getAlgn();
    return this;
  }
}
