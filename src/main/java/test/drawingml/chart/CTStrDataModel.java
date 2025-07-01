package test.drawingml.chart;

public class CTStrDataModel {
  private final CTUnsignedIntModel ptCount;

  private final CTStrValModel pt;

  private final CTExtensionListModel extLst;

  public CTStrDataModel(CTUnsignedIntModel ptCount, CTStrValModel pt, CTExtensionListModel extLst) {
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public CTStrValModel getPt() {
    return this.pt;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
