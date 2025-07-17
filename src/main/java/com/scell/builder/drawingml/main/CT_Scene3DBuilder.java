package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BackdropModel;
import com.scell.model.drawingml.main.CT_CameraModel;
import com.scell.model.drawingml.main.CT_LightRigModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_Scene3DModel;

public class CT_Scene3DBuilder {
  private CT_CameraModel camera;

  private CT_LightRigModel lightRig;

  private CT_BackdropModel backdrop;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_Scene3DBuilder() {
  }

  public CT_Scene3DBuilder setCamera(CT_CameraModel camera) {
    this.camera = camera;
    return this;
  }

  public CT_Scene3DBuilder setLightRig(CT_LightRigModel lightRig) {
    this.lightRig = lightRig;
    return this;
  }

  public CT_Scene3DBuilder setBackdrop(CT_BackdropModel backdrop) {
    this.backdrop = backdrop;
    return this;
  }

  public CT_Scene3DBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_Scene3DModel build() {
    return new CT_Scene3DModel(this.camera, this.lightRig, this.backdrop, this.extLst);
  }

  public CT_Scene3DBuilder from(CT_Scene3DModel value) {
    this.camera = value.getCamera();
    this.lightRig = value.getLightRig();
    this.backdrop = value.getBackdrop();
    this.extLst = value.getExtLst();
    return this;
  }
}
