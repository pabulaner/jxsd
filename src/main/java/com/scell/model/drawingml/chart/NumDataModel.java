package com.scell.model.drawingml.chart;

import java.util.List;

public class NumDataModel {
  private final XstringModel formatCode;

  private final UnsignedIntModel ptCount;

  private final List<NumValModel> pt;

  private final ExtensionListModel extLst;

  public NumDataModel(XstringModel formatCode, UnsignedIntModel ptCount, List<NumValModel> pt,
      ExtensionListModel extLst) {
    this.formatCode = formatCode;
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public XstringModel getFormatCode() {
    return this.formatCode;
  }

  public UnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public List<NumValModel> getPt() {
    return this.pt;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
