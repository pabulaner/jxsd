package test.drawingml.chart;

import test.XMLSchema.StringModel;

public class CTStrRefModel {
  private final StringModel f;

  private final CTStrDataModel strCache;

  private final CTExtensionListModel extLst;

  public CTStrRefModel(StringModel f, CTStrDataModel strCache, CTExtensionListModel extLst) {
    this.f = f;
    this.strCache = strCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public CTStrDataModel getStrCache() {
    return this.strCache;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
