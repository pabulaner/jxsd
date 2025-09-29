package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LayoutBuilder;

/**
 * This is a generated sequence class.
 */
public class LayoutModel {
  private final ManualLayoutModel manualLayout;

  private final ExtensionListModel extLst;

  public LayoutModel(ManualLayoutModel manualLayout, ExtensionListModel extLst) {
    this.manualLayout = manualLayout;
    this.extLst = extLst;
  }

  public LayoutBuilder builder() {
    return new LayoutBuilder().from(this);
  }

  public ManualLayoutModel getManualLayout() {
    return this.manualLayout;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
