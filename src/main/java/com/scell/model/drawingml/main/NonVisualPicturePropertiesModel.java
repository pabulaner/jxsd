package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class NonVisualPicturePropertiesModel {
  private final BooleanValueModel preferRelativeResize;

  private final PictureLockingModel picLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualPicturePropertiesModel(BooleanValueModel preferRelativeResize,
      PictureLockingModel picLocks, OfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public BooleanValueModel getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public PictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
