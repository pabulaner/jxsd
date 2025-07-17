package model.drawingml.chart;

import model.XMLSchema.stringModel;

public class CT_MultiLvlStrRefModel {
  private final stringModel f;

  private final CT_MultiLvlStrDataModel multiLvlStrCache;

  private final CT_ExtensionListModel extLst;

  public CT_MultiLvlStrRefModel(stringModel f, CT_MultiLvlStrDataModel multiLvlStrCache,
      CT_ExtensionListModel extLst) {
    this.f = f;
    this.multiLvlStrCache = multiLvlStrCache;
    this.extLst = extLst;
  }

  public stringModel getF() {
    return this.f;
  }

  public CT_MultiLvlStrDataModel getMultiLvlStrCache() {
    return this.multiLvlStrCache;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
