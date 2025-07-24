package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.MultiLvlStrDataModel;
import com.scell.model.drawingml.chart.MultiLvlStrRefModel;

public class MultiLvlStrRefBuilder {
  private StringModel f;

  private MultiLvlStrDataModel multiLvlStrCache;

  private ExtensionListModel extLst;

  public MultiLvlStrRefBuilder() {
  }

  public MultiLvlStrRefBuilder setF(StringModel f) {
    this.f = f;
    return this;
  }

  public MultiLvlStrRefBuilder setMultiLvlStrCache(MultiLvlStrDataModel multiLvlStrCache) {
    this.multiLvlStrCache = multiLvlStrCache;
    return this;
  }

  public MultiLvlStrRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public MultiLvlStrRefModel build() {
    return new MultiLvlStrRefModel(this.f, this.multiLvlStrCache, this.extLst);
  }

  public MultiLvlStrRefBuilder from(MultiLvlStrRefModel value) {
    this.f = value.getF();
    this.multiLvlStrCache = value.getMultiLvlStrCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
