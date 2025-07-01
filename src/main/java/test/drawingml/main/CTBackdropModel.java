package test.drawingml.main;

public class CTBackdropModel {
  private final CTPoint3DModel anchor;

  private final CTVector3DModel norm;

  private final CTVector3DModel up;

  private final CTOfficeArtExtensionListModel extLst;

  public CTBackdropModel(CTPoint3DModel anchor, CTVector3DModel norm, CTVector3DModel up,
      CTOfficeArtExtensionListModel extLst) {
    this.anchor = anchor;
    this.norm = norm;
    this.up = up;
    this.extLst = extLst;
  }

  public CTPoint3DModel getAnchor() {
    return this.anchor;
  }

  public CTVector3DModel getNorm() {
    return this.norm;
  }

  public CTVector3DModel getUp() {
    return this.up;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
