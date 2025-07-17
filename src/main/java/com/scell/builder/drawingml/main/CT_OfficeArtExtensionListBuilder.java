package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionModel;
import java.util.List;

public class CT_OfficeArtExtensionListBuilder {
  private List<CT_OfficeArtExtensionModel> ext;

  public CT_OfficeArtExtensionListBuilder() {
  }

  public CT_OfficeArtExtensionListBuilder setExt(List<CT_OfficeArtExtensionModel> ext) {
    this.ext = ext;
    return this;
  }

  public CT_OfficeArtExtensionListModel build() {
    return new CT_OfficeArtExtensionListModel(this.ext);
  }

  public CT_OfficeArtExtensionListBuilder from(CT_OfficeArtExtensionListModel value) {
    this.ext = value.getExt();
    return this;
  }
}
