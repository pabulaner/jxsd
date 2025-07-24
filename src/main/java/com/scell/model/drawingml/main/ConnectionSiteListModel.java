package com.scell.model.drawingml.main;

import java.util.List;

public class ConnectionSiteListModel {
  private final List<ConnectionSiteModel> cxn;

  public ConnectionSiteListModel(List<ConnectionSiteModel> cxn) {
    this.cxn = cxn;
  }

  public List<ConnectionSiteModel> getCxn() {
    return this.cxn;
  }
}
