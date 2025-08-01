package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.main.ConnectionModel;
import com.scell.model.drawingml.main.DrawingElementIdValueModel;

public class ConnectionBuilder {
  private DrawingElementIdValueModel id;

  private UnsignedIntValueModel idx;

  public ConnectionBuilder() {
  }

  public ConnectionBuilder setId(DrawingElementIdValueModel id) {
    this.id = id;
    return this;
  }

  public ConnectionBuilder setIdx(UnsignedIntValueModel idx) {
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
