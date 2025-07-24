package com.scell.model.drawingml.chart;

public class LayoutModel {
  private final ManualLayoutModel manualLayout;

  private final ExtensionListModel extLst;

  public LayoutModel(ManualLayoutModel manualLayout, ExtensionListModel extLst) {
    this.manualLayout = manualLayout;
    this.extLst = extLst;
  }

  public ManualLayoutModel getManualLayout() {
    return this.manualLayout;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
