package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_PivotSourceModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.chart.ST_XstringModel;
import java.util.List;

public class CT_PivotSourceBuilder {
  private ST_XstringModel name;

  private CT_UnsignedIntModel fmtId;

  private List<CT_ExtensionListModel> extLst;

  public CT_PivotSourceBuilder() {
  }

  public CT_PivotSourceBuilder setName(ST_XstringModel name) {
    this.name = name;
    return this;
  }

  public CT_PivotSourceBuilder setFmtId(CT_UnsignedIntModel fmtId) {
    this.fmtId = fmtId;
    return this;
  }

  public CT_PivotSourceBuilder setExtLst(List<CT_ExtensionListModel> extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_PivotSourceModel build() {
    return new CT_PivotSourceModel(this.name, this.fmtId, this.extLst);
  }

  public CT_PivotSourceBuilder from(CT_PivotSourceModel value) {
    this.name = value.getName();
    this.fmtId = value.getFmtId();
    this.extLst = value.getExtLst();
    return this;
  }
}
