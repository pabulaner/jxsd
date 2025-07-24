package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.ManualLayoutModel;

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

  public LayoutModel build() {
    return new LayoutModel(this.manualLayout, this.extLst);
  }

  public LayoutBuilder from(LayoutModel value) {
    this.manualLayout = value.getManualLayout();
    this.extLst = value.getExtLst();
    return this;
  }
}
