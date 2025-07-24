package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class ConnectionModel {
  private final DrawingElementIdModel id;

  private final UnsignedIntModel idx;

  public ConnectionModel(DrawingElementIdModel id, UnsignedIntModel idx) {
    this.id = id;
    this.idx = idx;
  }

  public DrawingElementIdModel getId() {
    return this.id;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }
}
