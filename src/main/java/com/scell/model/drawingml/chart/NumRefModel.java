package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;

public class NumRefModel {
  private final StringValueModel f;

  private final NumDataModel numCache;

  private final ExtensionListModel extLst;

  public NumRefModel(StringValueModel f, NumDataModel numCache, ExtensionListModel extLst) {
    this.f = f;
    this.numCache = numCache;
    this.extLst = extLst;
  }

  public StringValueModel getF() {
    return this.f;
  }

  public NumDataModel getNumCache() {
    return this.numCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
