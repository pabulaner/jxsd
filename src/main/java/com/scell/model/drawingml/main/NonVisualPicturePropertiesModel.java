package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class NonVisualPicturePropertiesModel {
  private final BooleanModel preferRelativeResize;

  private final PictureLockingModel picLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualPicturePropertiesModel(BooleanModel preferRelativeResize,
      PictureLockingModel picLocks, OfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public BooleanModel getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public PictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
