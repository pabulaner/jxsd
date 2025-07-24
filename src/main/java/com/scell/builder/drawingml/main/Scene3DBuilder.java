package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BackdropModel;
import com.scell.model.drawingml.main.CameraModel;
import com.scell.model.drawingml.main.LightRigModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.Scene3DModel;

public class Scene3DBuilder {
  private CameraModel camera;

  private LightRigModel lightRig;

  private BackdropModel backdrop;

  private OfficeArtExtensionListModel extLst;

  public Scene3DBuilder() {
  }

  public Scene3DBuilder setCamera(CameraModel camera) {
    this.camera = camera;
    return this;
  }

  public Scene3DBuilder setLightRig(LightRigModel lightRig) {
    this.lightRig = lightRig;
    return this;
  }

  public Scene3DBuilder setBackdrop(BackdropModel backdrop) {
    this.backdrop = backdrop;
    return this;
  }

  public Scene3DBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Scene3DModel build() {
    return new Scene3DModel(this.camera, this.lightRig, this.backdrop, this.extLst);
  }

  public Scene3DBuilder from(Scene3DModel value) {
    this.camera = value.getCamera();
    this.lightRig = value.getLightRig();
    this.backdrop = value.getBackdrop();
    this.extLst = value.getExtLst();
    return this;
  }
}
