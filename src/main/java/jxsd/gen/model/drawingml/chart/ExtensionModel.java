package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ExtensionBuilder;

/**
 * This is a generated sequence class.
 */
public class ExtensionModel {
  private final String uri;

  public ExtensionModel(String uri) {
    this.uri = uri;
  }

  public ExtensionBuilder builder() {
    return new ExtensionBuilder().from(this);
  }

  public String getUri() {
    return this.uri;
  }
}
