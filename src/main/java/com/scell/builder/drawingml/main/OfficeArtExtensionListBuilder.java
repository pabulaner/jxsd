package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.OfficeArtExtensionModel;
import java.util.List;

public class OfficeArtExtensionListBuilder {
  private List<OfficeArtExtensionModel> ext;

  public OfficeArtExtensionListBuilder() {
  }

  public OfficeArtExtensionListBuilder setExt(List<OfficeArtExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public OfficeArtExtensionListModel build() {
    return new OfficeArtExtensionListModel(this.ext);
  }

  public OfficeArtExtensionListBuilder from(OfficeArtExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }
}
