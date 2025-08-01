package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32ValueModel;
import com.scell.model.drawingml.main.TextTabAlignTypeValueModel;
import com.scell.model.drawingml.main.TextTabStopModel;

public class TextTabStopBuilder {
  private Coordinate32ValueModel pos;

  private TextTabAlignTypeValueModel algn;

  public TextTabStopBuilder() {
  }

  public TextTabStopBuilder setPos(Coordinate32ValueModel pos) {
    this.pos = pos;
    return this;
  }

  public TextTabStopBuilder setAlgn(TextTabAlignTypeValueModel algn) {
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
