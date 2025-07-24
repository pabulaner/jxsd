package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;

public class MultiLvlStrRefModel {
  private final StringModel f;

  private final MultiLvlStrDataModel multiLvlStrCache;

  private final ExtensionListModel extLst;

  public MultiLvlStrRefModel(StringModel f, MultiLvlStrDataModel multiLvlStrCache,
      ExtensionListModel extLst) {
    this.f = f;
    this.multiLvlStrCache = multiLvlStrCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public MultiLvlStrDataModel getMultiLvlStrCache() {
    return this.multiLvlStrCache;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
