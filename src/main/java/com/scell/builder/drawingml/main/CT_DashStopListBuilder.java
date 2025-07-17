package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_DashStopListModel;
import com.scell.model.drawingml.main.CT_DashStopModel;
import java.util.List;

public class CT_DashStopListBuilder {
  private List<CT_DashStopModel> ds;

  public CT_DashStopListBuilder() {
  }

  public CT_DashStopListBuilder setDs(List<CT_DashStopModel> ds) {
    this.ds = ds;
    return this;
  }

  public CT_DashStopListModel build() {
    return new CT_DashStopListModel(this.ds);
  }

  public CT_DashStopListBuilder from(CT_DashStopListModel value) {
    this.ds = value.getDs();
    return this;
  }
}
