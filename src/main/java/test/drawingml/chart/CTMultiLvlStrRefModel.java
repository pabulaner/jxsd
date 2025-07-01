package test.drawingml.chart;

import test.XMLSchema.StringModel;

public class CTMultiLvlStrRefModel {
  private final StringModel f;

  private final CTMultiLvlStrDataModel multiLvlStrCache;

  private final CTExtensionListModel extLst;

  public CTMultiLvlStrRefModel(StringModel f, CTMultiLvlStrDataModel multiLvlStrCache,
      CTExtensionListModel extLst) {
    this.f = f;
    this.multiLvlStrCache = multiLvlStrCache;
    this.extLst = extLst;
  }

  public StringModel getF() {
    return this.f;
  }

  public CTMultiLvlStrDataModel getMultiLvlStrCache() {
    return this.multiLvlStrCache;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
