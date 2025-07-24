package com.scell.model.drawingml.main;

import java.util.List;

public class DashStopListModel {
  private final List<DashStopModel> ds;

  public DashStopListModel(List<DashStopModel> ds) {
    this.ds = ds;
  }

  public List<DashStopModel> getDs() {
    return this.ds;
  }
}
