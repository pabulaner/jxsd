package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualPicturePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualPicturePropertiesModel {
  private final boolean preferRelativeResize;

  private final PictureLockingModel picLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualPicturePropertiesModel(boolean preferRelativeResize, PictureLockingModel picLocks,
      OfficeArtExtensionListModel extLst) {
    this.preferRelativeResize = preferRelativeResize;
    this.picLocks = picLocks;
    this.extLst = extLst;
  }

  public NonVisualPicturePropertiesBuilder builder() {
    return new NonVisualPicturePropertiesBuilder().from(this);
  }

  public boolean getPreferRelativeResize() {
    return this.preferRelativeResize;
  }

  public PictureLockingModel getPicLocks() {
    return this.picLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
