package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.OfficeArtExtensionListBuilder;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionListModel {
  private final List<OfficeArtExtensionModel> ext;

  public OfficeArtExtensionListModel(List<OfficeArtExtensionModel> ext) {
    this.ext = ext;
  }

  public OfficeArtExtensionListBuilder builder() {
    return new OfficeArtExtensionListBuilder().from(this);
  }

  public List<OfficeArtExtensionModel> getExt() {
    return this.ext;
  }
}
