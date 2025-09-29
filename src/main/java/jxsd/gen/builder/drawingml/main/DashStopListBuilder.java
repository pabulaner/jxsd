package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.DashStopListModel;
import jxsd.gen.model.drawingml.main.DashStopModel;

/**
 * This is a generated sequence class.
 */
public class DashStopListBuilder {
  private List<DashStopModel> ds;

  public DashStopListBuilder() {
  }

  public DashStopListBuilder setDs(List<DashStopModel> ds) {
    this.ds = ds;
    return this;
  }

  public DashStopListBuilder from(DashStopListModel value) {
    this.ds = value.getDs();
    return this;
  }

  public DashStopListModel build() {
    return new DashStopListModel(this.ds);
  }
}
