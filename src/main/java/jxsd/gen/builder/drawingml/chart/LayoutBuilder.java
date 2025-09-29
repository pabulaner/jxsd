package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.ManualLayoutModel;

/**
 * This is a generated sequence class.
 */
public class LayoutBuilder {
  private ManualLayoutModel manualLayout;

  private ExtensionListModel extLst;

  public LayoutBuilder() {
  }

  public LayoutBuilder setManualLayout(ManualLayoutModel manualLayout) {
    this.manualLayout = manualLayout;
    return this;
  }

  public LayoutBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LayoutBuilder from(LayoutModel value) {
    this.manualLayout = value.getManualLayout();
    this.extLst = value.getExtLst();
    return this;
  }

  public LayoutModel build() {
    return new LayoutModel(this.manualLayout, this.extLst);
  }
}
