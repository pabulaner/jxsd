package com.scell.model.drawingml.chart;

import java.util.List;

public class PivotSourceModel {
  private final XstringModel name;

  private final UnsignedIntModel fmtId;

  private final List<ExtensionListModel> extLst;

  public PivotSourceModel(XstringModel name, UnsignedIntModel fmtId,
      List<ExtensionListModel> extLst) {
    this.name = name;
    this.fmtId = fmtId;
    this.extLst = extLst;
  }

  public XstringModel getName() {
    return this.name;
  }

  public UnsignedIntModel getFmtId() {
    return this.fmtId;
  }

  public List<ExtensionListModel> getExtLst() {
    return this.extLst;
  }
}
