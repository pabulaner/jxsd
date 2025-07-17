package model.drawingml.main;

import java.util.List;

public class CT_DashStopListModel {
  private final List<CT_DashStopModel> ds;

  public CT_DashStopListModel(List<CT_DashStopModel> ds) {
    this.ds = ds;
  }

  public List<CT_DashStopModel> getDs() {
    return this.ds;
  }
}
