package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.Path2DListBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DListModel {
  private final List<Path2DModel> path;

  public Path2DListModel(List<Path2DModel> path) {
    this.path = path;
  }

  public Path2DListBuilder builder() {
    return new Path2DListBuilder().from(this);
  }

  public List<Path2DModel> getPath() {
    return this.path;
  }
}
