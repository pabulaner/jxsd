package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_StrDataModel;
import com.scell.model.drawingml.chart.CT_StrRefModel;

public class CT_StrRefBuilder {
  private StringModel f;

  private CT_StrDataModel strCache;

  private CT_ExtensionListModel extLst;

  public CT_StrRefBuilder() {
  }

  public CT_StrRefBuilder setF(StringModel f) {
    this.f = f;
    return this;
  }

  public CT_StrRefBuilder setStrCache(CT_StrDataModel strCache) {
    this.strCache = strCache;
    return this;
  }

  public CT_StrRefBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_StrRefModel build() {
    return new CT_StrRefModel(this.f, this.strCache, this.extLst);
  }

  public CT_StrRefBuilder from(CT_StrRefModel value) {
    this.f = value.getF();
    this.strCache = value.getStrCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
