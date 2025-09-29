package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PageSetupOrientationValueModel;

/**
 * This is a generated enum class.
 */
public class PageSetupOrientationValueBuilder {
  private PageSetupOrientationValueModel value;

  public PageSetupOrientationValueBuilder() {
  }

  public PageSetupOrientationValueBuilder setValue(PageSetupOrientationValueModel value) {
    this.value = value;
    return this;
  }

  public PageSetupOrientationValueBuilder from(PageSetupOrientationValueModel value) {
    this.value = value;
    return this;
  }

  public PageSetupOrientationValueModel build() {
    return this.value;
  }
}
