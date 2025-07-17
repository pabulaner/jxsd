package com.scell.model.drawingml.main;

import java.util.List;

public class CT_OfficeArtExtensionListModel {
  private final List<CT_OfficeArtExtensionModel> ext;

  public CT_OfficeArtExtensionListModel(List<CT_OfficeArtExtensionModel> ext) {
    this.ext = ext;
  }

  public List<CT_OfficeArtExtensionModel> getExt() {
    return this.ext;
  }
}
