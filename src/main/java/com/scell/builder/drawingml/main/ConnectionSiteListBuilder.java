package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ConnectionSiteListModel;
import com.scell.model.drawingml.main.ConnectionSiteModel;
import java.util.List;

public class ConnectionSiteListBuilder {
  private List<ConnectionSiteModel> cxn;

  public ConnectionSiteListBuilder() {
  }

  public ConnectionSiteListBuilder setCxn(List<ConnectionSiteModel> cxn) {
    this.cxn = cxn;
    return this;
  }

  public ConnectionSiteListModel build() {
    return new ConnectionSiteListModel(this.cxn);
  }

  public ConnectionSiteListBuilder from(ConnectionSiteListModel value) {
    this.cxn = value.getCxn();
    return this;
  }
}
