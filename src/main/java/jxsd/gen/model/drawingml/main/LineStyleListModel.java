package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.LineStyleListBuilder;

/**
 * This is a generated sequence class.
 */
public class LineStyleListModel {
  private final List<LinePropertiesModel> ln;

  public LineStyleListModel(List<LinePropertiesModel> ln) {
    this.ln = ln;
  }

  public LineStyleListBuilder builder() {
    return new LineStyleListBuilder().from(this);
  }

  public List<LinePropertiesModel> getLn() {
    return this.ln;
  }
}
