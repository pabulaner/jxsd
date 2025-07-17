package model.drawingml.chart;

import model.XMLSchema.stringModel;

public class CT_StrRefModel {
  private final stringModel f;

  private final CT_StrDataModel strCache;

  private final CT_ExtensionListModel extLst;

  public CT_StrRefModel(stringModel f, CT_StrDataModel strCache, CT_ExtensionListModel extLst) {
    this.f = f;
    this.strCache = strCache;
    this.extLst = extLst;
  }

  public stringModel getF() {
    return this.f;
  }

  public CT_StrDataModel getStrCache() {
    return this.strCache;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
