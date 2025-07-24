package com.scell.model.drawingml.chart;

import java.util.List;

public class ExtensionListModel {
  private final List<ExtensionModel> ext;

  public ExtensionListModel(List<ExtensionModel> ext) {
    this.ext = ext;
  }

  public List<ExtensionModel> getExt() {
    return this.ext;
  }
}
