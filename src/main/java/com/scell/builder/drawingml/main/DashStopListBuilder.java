package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DashStopListModel;
import com.scell.model.drawingml.main.DashStopModel;
import java.util.List;

public class DashStopListBuilder {
  private List<DashStopModel> ds;

  public DashStopListBuilder() {
  }

  public DashStopListBuilder setDs(List<DashStopModel> ds) {
    this.ds = ds;
    return this;
  }

  public DashStopListModel build() {
    return new DashStopListModel(this.ds);
  }

  public DashStopListBuilder from(DashStopListModel value) {
    this.ds = value.getDs();
    return this;
  }
}
