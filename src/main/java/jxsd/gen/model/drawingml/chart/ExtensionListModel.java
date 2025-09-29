package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.ExtensionListBuilder;

/**
 * This is a generated sequence class.
 */
public class ExtensionListModel {
  private final List<ExtensionModel> ext;

  public ExtensionListModel(List<ExtensionModel> ext) {
    this.ext = ext;
  }

  public ExtensionListBuilder builder() {
    return new ExtensionListBuilder().from(this);
  }

  public List<ExtensionModel> getExt() {
    return this.ext;
  }
}
