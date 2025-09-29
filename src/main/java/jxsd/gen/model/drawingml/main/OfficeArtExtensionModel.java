package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.OfficeArtExtensionBuilder;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionModel {
  private final String uri;

  public OfficeArtExtensionModel(String uri) {
    this.uri = uri;
  }

  public OfficeArtExtensionBuilder builder() {
    return new OfficeArtExtensionBuilder().from(this);
  }

  public String getUri() {
    return this.uri;
  }
}
