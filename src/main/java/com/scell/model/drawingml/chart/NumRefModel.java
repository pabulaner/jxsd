package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;

public class NumRefModel {
  private final StringModel f;

  private final NumDataModel numCache;

  private final ExtensionListModel extLst;

  public NumRefModel(StringModel f, NumDataModel numCache, ExtensionListModel extLst) {
    this.f = f;
    this.numCache = numCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public NumDataModel getNumCache() {
    return this.numCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
