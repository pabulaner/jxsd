package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_NumDataModel {
  private final ST_XstringModel formatCode;

  private final CT_UnsignedIntModel ptCount;

  private final List<CT_NumValModel> pt;

  private final CT_ExtensionListModel extLst;

  public CT_NumDataModel(ST_XstringModel formatCode, CT_UnsignedIntModel ptCount,
      List<CT_NumValModel> pt, CT_ExtensionListModel extLst) {
    this.formatCode = formatCode;
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public ST_XstringModel getFormatCode() {
    return this.formatCode;
  }

  public CT_UnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public List<CT_NumValModel> getPt() {
    return this.pt;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
