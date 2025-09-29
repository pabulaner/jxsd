package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.OfficeArtExtensionModel;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionBuilder {
  private String uri;

  public OfficeArtExtensionBuilder() {
  }

  public OfficeArtExtensionBuilder setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public OfficeArtExtensionBuilder from(OfficeArtExtensionModel value) {
    this.uri = value.getUri();
    return this;
  }

  public OfficeArtExtensionModel build() {
    return new OfficeArtExtensionModel(this.uri);
  }
}
