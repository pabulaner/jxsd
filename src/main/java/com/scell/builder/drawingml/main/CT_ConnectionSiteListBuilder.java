package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ConnectionSiteListModel;
import com.scell.model.drawingml.main.CT_ConnectionSiteModel;
import java.util.List;

public class CT_ConnectionSiteListBuilder {
  private List<CT_ConnectionSiteModel> cxn;

  public CT_ConnectionSiteListBuilder() {
  }

  public CT_ConnectionSiteListBuilder setCxn(List<CT_ConnectionSiteModel> cxn) {
    this.cxn = cxn;
    return this;
  }

  public CT_ConnectionSiteListModel build() {
    return new CT_ConnectionSiteListModel(this.cxn);
  }

  public CT_ConnectionSiteListBuilder from(CT_ConnectionSiteListModel value) {
    this.cxn = value.getCxn();
    return this;
  }
}
