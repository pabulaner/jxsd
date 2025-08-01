package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumDataModel;
import com.scell.model.drawingml.chart.NumRefModel;

public class NumRefBuilder {
  private StringValueModel f;

  private NumDataModel numCache;

  private ExtensionListModel extLst;

  public NumRefBuilder() {
  }

  public NumRefBuilder setF(StringValueModel f) {
    this.f = f;
    return this;
  }

  public NumRefBuilder setNumCache(NumDataModel numCache) {
    this.numCache = numCache;
    return this;
  }

  public NumRefBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NumRefModel build() {
    return new NumRefModel(this.f, this.numCache, this.extLst);
  }

  public NumRefBuilder from(NumRefModel value) {
    this.f = value.getF();
    this.numCache = value.getNumCache();
    this.extLst = value.getExtLst();
    return this;
  }
}
