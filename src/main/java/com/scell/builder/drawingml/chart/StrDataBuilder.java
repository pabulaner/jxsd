package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.StrDataModel;
import com.scell.model.drawingml.chart.StrValModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class StrDataBuilder {
  private UnsignedIntModel ptCount;

  private List<StrValModel> pt;

  private ExtensionListModel extLst;

  public StrDataBuilder() {
  }

  public StrDataBuilder setPtCount(UnsignedIntModel ptCount) {
    this.ptCount = ptCount;
    return this;
  }

  public StrDataBuilder setPt(List<StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public StrDataBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public StrDataModel build() {
    return new StrDataModel(this.ptCount, this.pt, this.extLst);
  }

  public StrDataBuilder from(StrDataModel value) {
    this.ptCount = value.getPtCount();
    this.pt = value.getPt();
    this.extLst = value.getExtLst();
    return this;
  }
}
