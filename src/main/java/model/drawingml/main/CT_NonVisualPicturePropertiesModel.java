package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_NonVisualPicturePropertiesModel {
  private final booleanModel preferRelativeResize;

  private final CT_PictureLockingModel picLocks;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualPicturePropertiesModel(booleanModel preferRelativeResize,
      CT_PictureLockingModel picLocks, CT_OfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public booleanModel getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public CT_PictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
