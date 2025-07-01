package test.drawingml.main;

public class CTScene3DModel {
  private final CTCameraModel camera;

  private final CTLightRigModel lightRig;

  private final CTBackdropModel backdrop;

  private final CTOfficeArtExtensionListModel extLst;

  public CTScene3DModel(CTCameraModel camera, CTLightRigModel lightRig, CTBackdropModel backdrop,
      CTOfficeArtExtensionListModel extLst) {
    this.camera = camera;
    this.lightRig = lightRig;
    this.backdrop = backdrop;
    this.extLst = extLst;
  }

  public CTCameraModel getCamera() {
    return this.camera;
  }

  public CTLightRigModel getLightRig() {
    return this.lightRig;
  }

  public CTBackdropModel getBackdrop() {
    return this.backdrop;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
