package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MultiLvlStrDataModel;
import com.scell.model.drawingml.chart.CT_MultiLvlStrRefModel;

public class CT_MultiLvlStrRefBuilder {
  private StringModel f;

  private CT_MultiLvlStrDataModel multiLvlStrCache;

  private CT_ExtensionListModel extLst;

  public CT_MultiLvlStrRefBuilder() {
  }

  public CT_MultiLvlStrRefBuilder setF(StringModel f) {
    this.f = f;
    return this;
  }

  public CT_MultiLvlStrRefBuilder setMultiLvlStrCache(CT_MultiLvlStrDataModel multiLvlStrCache) {
    this.multiLvlStrCache = multiLvlStrCache;
    return this;
  }

  public CT_MultiLvlStrRefBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_MultiLvlStrRefModel build() {
    return new CT_MultiLvlStrRefModel(this.f, this.multiLvlStrCache, this.extLst);
  }

  public CT_MultiLvlStrRefBuilder from(CT_MultiLvlStrRefModel value) {
    this.f = value.getF();
    this.multiLvlStrCache = value.getMultiLvlStrCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
