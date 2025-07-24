package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.main.ConnectionModel;
import com.scell.model.drawingml.main.DrawingElementIdModel;

public class ConnectionBuilder {
  private DrawingElementIdModel id;

  private UnsignedIntModel idx;

  public ConnectionBuilder() {
  }

  public ConnectionBuilder setId(DrawingElementIdModel id) {
    this.id = id;
    return this;
  }

  public ConnectionBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public ConnectionModel build() {
    return new ConnectionModel(this.id, this.idx);
  }

  public ConnectionBuilder from(ConnectionModel value) {
    this.id = value.getId();
    this.idx = value.getIdx();
    return this;
  }
}
