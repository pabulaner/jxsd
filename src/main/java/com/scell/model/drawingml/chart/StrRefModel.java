package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;

public class StrRefModel {
  private final StringValueModel f;

  private final StrDataModel strCache;

  private final ExtensionListModel extLst;

  public StrRefModel(StringValueModel f, StrDataModel strCache, ExtensionListModel extLst) {
    this.f = f;
    this.strCache = strCache;
    this.extLst = extLst;
  }

  public StringValueModel getF() {
    return this.f;
  }

  public StrDataModel getStrCache() {
    return this.strCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
