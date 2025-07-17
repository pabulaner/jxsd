package model.drawingml.main;

import java.util.List;

public class CT_ConnectionSiteListModel {
  private final List<CT_ConnectionSiteModel> cxn;

  public CT_ConnectionSiteListModel(List<CT_ConnectionSiteModel> cxn) {
    this.cxn = cxn;
  }

  public List<CT_ConnectionSiteModel> getCxn() {
    return this.cxn;
  }
}
