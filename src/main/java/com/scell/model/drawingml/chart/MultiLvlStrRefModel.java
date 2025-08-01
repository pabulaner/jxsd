package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;

public class MultiLvlStrRefModel {
  private final StringValueModel f;

  private final MultiLvlStrDataModel multiLvlStrCache;

  private final ExtensionListModel extLst;

  public MultiLvlStrRefModel(StringValueModel f, MultiLvlStrDataModel multiLvlStrCache,
      ExtensionListModel extLst) {
    this.f = f;
    this.multiLvlStrCache = multiLvlStrCache;
    this.extLst = extLst;
  }

  public StringValueModel getF() {
    return this.f;
  }

  public MultiLvlStrDataModel getMultiLvlStrCache() {
    return this.multiLvlStrCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
