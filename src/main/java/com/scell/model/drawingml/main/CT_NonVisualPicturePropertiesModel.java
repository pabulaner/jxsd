package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class CT_NonVisualPicturePropertiesModel {
  private final BooleanModel preferRelativeResize;

  private final CT_PictureLockingModel picLocks;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualPicturePropertiesModel(BooleanModel preferRelativeResize,
      CT_PictureLockingModel picLocks, CT_OfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public BooleanModel getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public CT_PictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
