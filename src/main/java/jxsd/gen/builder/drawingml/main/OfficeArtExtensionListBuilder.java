package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionModel;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionListBuilder {
  private List<OfficeArtExtensionModel> ext;

  public OfficeArtExtensionListBuilder() {
  }

  public OfficeArtExtensionListBuilder setExt(List<OfficeArtExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public OfficeArtExtensionListBuilder from(OfficeArtExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }

  public OfficeArtExtensionListModel build() {
    return new OfficeArtExtensionListModel(this.ext);
  }
}
