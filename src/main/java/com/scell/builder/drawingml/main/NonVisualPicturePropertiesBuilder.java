package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.NonVisualPicturePropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PictureLockingModel;

public class NonVisualPicturePropertiesBuilder {
  private BooleanModel preferRelativeResize;

  private PictureLockingModel picLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualPicturePropertiesBuilder() {
  }

  public NonVisualPicturePropertiesBuilder setPreferRelativeResize(
      BooleanModel preferRelativeResize) {
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

  public NonVisualPicturePropertiesModel build() {
    return new NonVisualPicturePropertiesModel(this.preferRelativeResize, this.picLocks, this.extLst);
  }

  public NonVisualPicturePropertiesBuilder from(NonVisualPicturePropertiesModel value) {
    this.preferRelativeResize = value.getPreferRelativeResize();
    this.picLocks = value.getPicLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
