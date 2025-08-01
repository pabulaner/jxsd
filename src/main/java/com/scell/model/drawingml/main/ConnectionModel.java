package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class ConnectionModel {
  private final DrawingElementIdValueModel id;

  private final UnsignedIntValueModel idx;

  public ConnectionModel(DrawingElementIdValueModel id, UnsignedIntValueModel idx) {
    this.id = id;
    this.idx = idx;
  }

  public DrawingElementIdValueModel getId() {
    return this.id;
  }

  public UnsignedIntValueModel getIdx() {
    return this.idx;
  }
}
