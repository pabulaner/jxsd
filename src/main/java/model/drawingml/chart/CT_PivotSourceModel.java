package model.drawingml.chart;

import java.util.List;

public class CT_PivotSourceModel {
  private final ST_XstringModel name;

  private final CT_UnsignedIntModel fmtId;

  private final List<CT_ExtensionListModel> extLst;

  public CT_PivotSourceModel(ST_XstringModel name, CT_UnsignedIntModel fmtId,
      List<CT_ExtensionListModel> extLst) {
    this.name = name;
    this.fmtId = fmtId;
    this.extLst = extLst;
  }

  public ST_XstringModel getName() {
    return this.name;
  }

  public CT_UnsignedIntModel getFmtId() {
    return this.fmtId;
  }

  public List<CT_ExtensionListModel> getExtLst() {
    return this.extLst;
  }
}
