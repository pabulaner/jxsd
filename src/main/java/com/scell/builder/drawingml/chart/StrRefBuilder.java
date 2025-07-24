package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.StrDataModel;
import com.scell.model.drawingml.chart.StrRefModel;

public class StrRefBuilder {
  private StringModel f;

  private StrDataModel strCache;

  private ExtensionListModel extLst;

  public StrRefBuilder() {
  }

  public StrRefBuilder setF(StringModel f) {
    this.f = f;
    return this;
  }

  public StrRefBuilder setStrCache(StrDataModel strCache) {
    this.strCache = strCache;
    return this;
  }

  public StrRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public StrRefModel build() {
    return new StrRefModel(this.f, this.strCache, this.extLst);
  }

  public StrRefBuilder from(StrRefModel value) {
    this.f = value.getF();
    this.strCache = value.getStrCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
