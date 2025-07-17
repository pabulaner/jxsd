package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_StrDataModel;
import com.scell.model.drawingml.chart.CT_StrValModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_StrDataBuilder {
  private CT_UnsignedIntModel ptCount;

  private List<CT_StrValModel> pt;

  private CT_ExtensionListModel extLst;

  public CT_StrDataBuilder() {
  }

  public CT_StrDataBuilder setPtCount(CT_UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public CT_StrDataBuilder setPt(List<CT_StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public CT_StrDataBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_StrDataModel build() {
    return new CT_StrDataModel(this.ptCount, this.pt, this.extLst);
  }

  public CT_StrDataBuilder from(CT_StrDataModel value) {
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }
}
