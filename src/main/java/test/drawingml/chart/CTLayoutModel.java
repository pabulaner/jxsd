package test.drawingml.chart;

public class CTLayoutModel {
  private final CTManualLayoutModel manualLayout;

  private final CTExtensionListModel extLst;

  public CTLayoutModel(CTManualLayoutModel manualLayout, CTExtensionListModel extLst) {
    this.manualLayout = manualLayout;
    this.extLst = extLst;
  }

  public CTManualLayoutModel getManualLayout() {
    return this.manualLayout;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
