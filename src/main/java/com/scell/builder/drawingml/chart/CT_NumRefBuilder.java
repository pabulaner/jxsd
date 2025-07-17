package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataModel;
import com.scell.model.drawingml.chart.CT_NumRefModel;

public class CT_NumRefBuilder {
  private StringModel f;

  private CT_NumDataModel numCache;

  private CT_ExtensionListModel extLst;

  public CT_NumRefBuilder() {
  }

  public CT_NumRefBuilder setF(StringModel f) {
    this.f = f;
    return this;
  }

  public CT_NumRefBuilder setNumCache(CT_NumDataModel numCache) {
    this.numCache = numCache;
    return this;
  }

  public CT_NumRefBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NumRefModel build() {
    return new CT_NumRefModel(this.f, this.numCache, this.extLst);
  }

  public CT_NumRefBuilder from(CT_NumRefModel value) {
    this.f = value.getF();
    this.numCache = value.getNumCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
