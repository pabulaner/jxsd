package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.LinePropertiesModel;
import jxsd.gen.model.drawingml.main.LineStyleListModel;

/**
 * This is a generated sequence class.
 */
public class LineStyleListBuilder {
  private List<LinePropertiesModel> ln;

  public LineStyleListBuilder() {
  }

  public LineStyleListBuilder setLn(List<LinePropertiesModel> ln) {
    this.ln = ln;
    return this;
  }

  public LineStyleListBuilder from(LineStyleListModel value) {
    this.ln = value.getLn();
    return this;
  }

  public LineStyleListModel build() {
    return new LineStyleListModel(this.ln);
  }
}
