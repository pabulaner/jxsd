package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;

public class StrRefModel {
  private final StringModel f;

  private final StrDataModel strCache;

  private final ExtensionListModel extLst;

  public StrRefModel(StringModel f, StrDataModel strCache, ExtensionListModel extLst) {
    this.f = f;
    this.strCache = strCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public StrDataModel getStrCache() {
    return this.strCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
