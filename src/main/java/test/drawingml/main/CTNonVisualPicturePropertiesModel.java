package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTNonVisualPicturePropertiesModel {
  private final BooleanModel preferRelativeResize;

  private final CTPictureLockingModel picLocks;

  private final CTOfficeArtExtensionListModel extLst;

  public CTNonVisualPicturePropertiesModel(BooleanModel preferRelativeResize,
      CTPictureLockingModel picLocks, CTOfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public BooleanModel getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public CTPictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
