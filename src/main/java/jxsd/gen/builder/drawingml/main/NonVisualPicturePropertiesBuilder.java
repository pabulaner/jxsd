package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.NonVisualPicturePropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PictureLockingModel;

/**
 * This is a generated sequence class.
 */
public class NonVisualPicturePropertiesBuilder {
  private boolean preferRelativeResize;

  private PictureLockingModel picLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualPicturePropertiesBuilder() {
  }

  public NonVisualPicturePropertiesBuilder setPreferRelativeResize(boolean preferRelativeResize) {
    this.preferRelativeResize = preferRelativeResize;
    return this;
  }

  public NonVisualPicturePropertiesBuilder setPicLocks(PictureLockingModel picLocks) {
    this.picLocks = picLocks;
    return this;
  }

  public NonVisualPicturePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualPicturePropertiesBuilder from(NonVisualPicturePropertiesModel value) {
    this.preferRelativeResize = value.getPreferRelativeResize();
    this.picLocks = value.getPicLocks();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualPicturePropertiesModel build() {
    return new NonVisualPicturePropertiesModel(this.preferRelativeResize, this.picLocks, this.extLst);
  }
}
