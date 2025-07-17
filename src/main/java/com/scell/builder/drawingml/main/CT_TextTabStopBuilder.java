package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextTabStopModel;
import com.scell.model.drawingml.main.ST_Coordinate32Model;
import com.scell.model.drawingml.main.ST_TextTabAlignTypeModel;

public class CT_TextTabStopBuilder {
  private ST_Coordinate32Model pos;

  private ST_TextTabAlignTypeModel algn;

  public CT_TextTabStopBuilder() {
  }

  public CT_TextTabStopBuilder setPos(ST_Coordinate32Model pos) {
    this.pos = pos;
    return this;
  }

  public CT_TextTabStopBuilder setAlgn(ST_TextTabAlignTypeModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_TextTabStopModel build() {
    return new CT_TextTabStopModel(this.pos, this.algn);
  }

  public CT_TextTabStopBuilder from(CT_TextTabStopModel value) {
    this.pos = value.getPos();
    this.algn = value.getAlgn();
    return this;
  }
}
