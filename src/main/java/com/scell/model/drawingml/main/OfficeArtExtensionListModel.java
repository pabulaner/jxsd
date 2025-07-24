package com.scell.model.drawingml.main;

import java.util.List;

public class OfficeArtExtensionListModel {
  private final List<OfficeArtExtensionModel> ext;

  public OfficeArtExtensionListModel(List<OfficeArtExtensionModel> ext) {
    this.ext = ext;
  }

  public List<OfficeArtExtensionModel> getExt() {
    return this.ext;
  }
}
