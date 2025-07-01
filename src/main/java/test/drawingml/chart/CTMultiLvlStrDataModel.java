package test.drawingml.chart;

public class CTMultiLvlStrDataModel {
  private final CTUnsignedIntModel ptCount;

  private final CTLvlModel lvl;

  private final CTExtensionListModel extLst;

  public CTMultiLvlStrDataModel(CTUnsignedIntModel ptCount, CTLvlModel lvl,
      CTExtensionListModel extLst) {
    this.ptCount = ptCount;
    this.lvl = lvl;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public CTLvlModel getLvl() {
    return this.lvl;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
