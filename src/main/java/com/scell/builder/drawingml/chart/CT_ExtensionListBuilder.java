package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_ExtensionModel;
import java.util.List;

public class CT_ExtensionListBuilder {
  private List<CT_ExtensionModel> ext;

  public CT_ExtensionListBuilder() {
  }

  public CT_ExtensionListBuilder setExt(List<CT_ExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public CT_ExtensionListModel build() {
    return new CT_ExtensionListModel(this.ext);
  }

  public CT_ExtensionListBuilder from(CT_ExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }
}
