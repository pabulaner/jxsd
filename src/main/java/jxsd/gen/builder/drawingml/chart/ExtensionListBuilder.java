package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.ExtensionModel;

/**
 * This is a generated sequence class.
 */
public class ExtensionListBuilder {
  private List<ExtensionModel> ext;

  public ExtensionListBuilder() {
  }

  public ExtensionListBuilder setExt(List<ExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public ExtensionListBuilder from(ExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }

  public ExtensionListModel build() {
    return new ExtensionListModel(this.ext);
  }
}
