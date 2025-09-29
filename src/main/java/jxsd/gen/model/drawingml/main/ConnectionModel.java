package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ConnectionBuilder;

/**
 * This is a generated sequence class.
 */
public class ConnectionModel {
  private final long id;

  private final long idx;

  public ConnectionModel(long id, long idx) {
    this.id = id;
    this.idx = idx;
  }

  public ConnectionBuilder builder() {
    return new ConnectionBuilder().from(this);
  }

  public long getId() {
    return this.id;
  }

  public long getIdx() {
    return this.idx;
  }
}
