package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ConnectionModel;

/**
 * This is a generated sequence class.
 */
public class ConnectionBuilder {
  private long id;

  private long idx;

  public ConnectionBuilder() {
  }

  public ConnectionBuilder setId(long id) {
    this.id = id;
    return this;
  }

  public ConnectionBuilder setIdx(long idx) {
    this.idx = idx;
    return this;
  }

  public ConnectionBuilder from(ConnectionModel value) {
    this.id = value.getId();
    this.idx = value.getIdx();
    return this;
  }

  public ConnectionModel build() {
    return new ConnectionModel(this.id, this.idx);
  }
}
