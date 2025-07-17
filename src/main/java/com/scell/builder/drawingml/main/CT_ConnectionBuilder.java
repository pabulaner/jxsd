package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ConnectionModel;
import com.scell.model.drawingml.main.ST_DrawingElementIdModel;

public class CT_ConnectionBuilder {
  private ST_DrawingElementIdModel id;

  private UnsignedIntModel idx;

  public CT_ConnectionBuilder() {
  }

  public CT_ConnectionBuilder setId(ST_DrawingElementIdModel id) {
    this.id = id;
    return this;
  }

  public CT_ConnectionBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_ConnectionModel build() {
    return new CT_ConnectionModel(this.id, this.idx);
  }

  public CT_ConnectionBuilder from(CT_ConnectionModel value) {
    this.id = value.getId();
    this.idx = value.getIdx();
    return this;
  }
}
