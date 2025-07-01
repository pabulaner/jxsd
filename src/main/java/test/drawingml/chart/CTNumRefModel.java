package test.drawingml.chart;

import test.XMLSchema.StringModel;

public class CTNumRefModel {
  private final StringModel f;

  private final CTNumDataModel numCache;

  private final CTExtensionListModel extLst;

  public CTNumRefModel(StringModel f, CTNumDataModel numCache, CTExtensionListModel extLst) {
    this.f = f;
    this.numCache = numCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public CTNumDataModel getNumCache() {
    return this.numCache;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
