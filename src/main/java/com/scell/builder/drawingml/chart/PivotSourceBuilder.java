package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.PivotSourceModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.chart.XstringValueModel;
import java.util.List;

public class PivotSourceBuilder {
  private XstringValueModel name;

  private UnsignedIntModel fmtId;

  private List<ExtensionListModel> extLst;

  public PivotSourceBuilder() {
  }

  public PivotSourceBuilder setName(XstringValueModel name) {
    this.name = name;
    return this;
  }

  public PivotSourceBuilder setFmtId(UnsignedIntModel fmtId) {
    this.fmtId = fmtId;
    return this;
  }

  public PivotSourceBuilder setExtLst(List<ExtensionListModel> extLst) {
    this.extLst = extLst;
    return this;
  }

  public PivotSourceModel build() {
    return new PivotSourceModel(this.name, this.fmtId, this.extLst);
  }

  public PivotSourceBuilder from(PivotSourceModel value) {
    this.name = value.getName();
    this.fmtId = value.getFmtId();
    this.extLst = value.getExtLst();
    return this;
  }
}
