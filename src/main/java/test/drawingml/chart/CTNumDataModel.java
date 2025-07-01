package test.drawingml.chart;

public class CTNumDataModel {
  private final STXstringModel formatCode;

  private final CTUnsignedIntModel ptCount;

  private final CTNumValModel pt;

  private final CTExtensionListModel extLst;

  public CTNumDataModel(STXstringModel formatCode, CTUnsignedIntModel ptCount, CTNumValModel pt,
      CTExtensionListModel extLst) {
    this.formatCode = formatCode;
    this.ptCount = ptCount;
    this.pt = pt;
    this.extLst = extLst;
  }

  public STXstringModel getFormatCode() {
    return this.formatCode;
  }

  public CTUnsignedIntModel getPtCount() {
    return this.ptCount;
  }

  public CTNumValModel getPt() {
    return this.pt;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
