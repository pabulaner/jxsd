package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_NonVisualPicturePropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PictureLockingModel;

public class CT_NonVisualPicturePropertiesBuilder {
  private BooleanModel preferRelativeResize;

  private CT_PictureLockingModel picLocks;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualPicturePropertiesBuilder() {
  }

  public CT_NonVisualPicturePropertiesBuilder setPreferRelativeResize(
      BooleanModel preferRelativeResize) {
    this.preferRelativeResize = preferRelativeResize;
    return this;
  }

  public CT_NonVisualPicturePropertiesBuilder setPicLocks(CT_PictureLockingModel picLocks) {
    this.picLocks = picLocks;
    return this;
  }

  public CT_NonVisualPicturePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualPicturePropertiesModel build() {
    return new CT_NonVisualPicturePropertiesModel(this.preferRelativeResize, this.picLocks, this.extLst);
  }

  public CT_NonVisualPicturePropertiesBuilder from(CT_NonVisualPicturePropertiesModel value) {
    this.preferRelativeResize = value.getPreferRelativeResize();
    this.picLocks = value.getPicLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
