package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_ExtensionListModel {
  private final List<CT_ExtensionModel> ext;

  public CT_ExtensionListModel(List<CT_ExtensionModel> ext) {
    this.ext = ext;
  }

  public List<CT_ExtensionModel> getExt() {
    return this.ext;
  }
}
