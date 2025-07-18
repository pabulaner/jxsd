package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_ManualLayoutModel;

public class CT_LayoutBuilder {
  private CT_ManualLayoutModel manualLayout;

  private CT_ExtensionListModel extLst;

  public CT_LayoutBuilder() {
  }

  public CT_LayoutBuilder setManualLayout(CT_ManualLayoutModel manualLayout) {
    this.manualLayout = manualLayout;
    return this;
  }

  public CT_LayoutBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LayoutModel build() {
    return new CT_LayoutModel(this.manualLayout, this.extLst);
  }

  public CT_LayoutBuilder from(CT_LayoutModel value) {
    this.manualLayout = value.getManualLayout();
    this.extLst = value.getExtLst();
    return this;
  }
}
