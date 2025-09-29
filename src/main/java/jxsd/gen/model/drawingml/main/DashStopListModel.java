package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.DashStopListBuilder;

/**
 * This is a generated sequence class.
 */
public class DashStopListModel {
  private final List<DashStopModel> ds;

  public DashStopListModel(List<DashStopModel> ds) {
    this.ds = ds;
  }

  public DashStopListBuilder builder() {
    return new DashStopListBuilder().from(this);
  }

  public List<DashStopModel> getDs() {
    return this.ds;
  }
}
