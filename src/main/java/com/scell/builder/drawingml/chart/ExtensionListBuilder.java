package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.ExtensionModel;
import java.util.List;

public class ExtensionListBuilder {
  private List<ExtensionModel> ext;

  public ExtensionListBuilder() {
  }

  public ExtensionListBuilder setExt(List<ExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public ExtensionListModel build() {
    return new ExtensionListModel(this.ext);
  }

  public ExtensionListBuilder from(ExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }
}
