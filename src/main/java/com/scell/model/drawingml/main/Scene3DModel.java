package com.scell.model.drawingml.main;

public class Scene3DModel {
  private final CameraModel camera;

  private final LightRigModel lightRig;

  private final BackdropModel backdrop;

  private final OfficeArtExtensionListModel extLst;

  public Scene3DModel(CameraModel camera, LightRigModel lightRig, BackdropModel backdrop,
      OfficeArtExtensionListModel extLst) {
    this.camera = camera;
    this.lightRig = lightRig;
    this.backdrop = backdrop;
    this.extLst = extLst;
  }

  public CameraModel getCamera() {
    return this.camera;
  }

  public LightRigModel getLightRig() {
    return this.lightRig;
  }

  public BackdropModel getBackdrop() {
    return this.backdrop;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
