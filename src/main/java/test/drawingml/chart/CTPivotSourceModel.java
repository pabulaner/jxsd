package test.drawingml.chart;

public class CTPivotSourceModel {
  private final STXstringModel name;

  private final CTUnsignedIntModel fmtId;

  private final CTExtensionListModel extLst;

  public CTPivotSourceModel(STXstringModel name, CTUnsignedIntModel fmtId,
      CTExtensionListModel extLst) {
    this.name = name;
    this.fmtId = fmtId;
    this.extLst = extLst;
  }

  public STXstringModel getName() {
    return this.name;
  }

  public CTUnsignedIntModel getFmtId() {
    return this.fmtId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
