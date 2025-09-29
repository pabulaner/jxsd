package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.Path2DListModel;
import jxsd.gen.model.drawingml.main.Path2DModel;

/**
 * This is a generated sequence class.
 */
public class Path2DListBuilder {
  private List<Path2DModel> path;

  public Path2DListBuilder() {
  }

  public Path2DListBuilder setPath(List<Path2DModel> path) {
    this.path = path;
    return this;
  }

  public Path2DListBuilder from(Path2DListModel value) {
    this.path = value.getPath();
    return this;
  }

  public Path2DListModel build() {
    return new Path2DListModel(this.path);
  }
}
