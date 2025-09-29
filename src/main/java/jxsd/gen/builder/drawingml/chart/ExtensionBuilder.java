package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionModel;

/**
 * This is a generated sequence class.
 */
public class ExtensionBuilder {
  private String uri;

  public ExtensionBuilder() {
  }

  public ExtensionBuilder setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public ExtensionBuilder from(ExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }

  public ExtensionModel build() {
    return new ExtensionModel(this.uri);
  }
}
