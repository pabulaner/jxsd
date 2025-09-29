package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BackdropBuilder;

/**
 * This is a generated sequence class.
 */
public class BackdropModel {
  private final Point3DModel anchor;

  private final Vector3DModel norm;

  private final Vector3DModel up;

  private final OfficeArtExtensionListModel extLst;

  public BackdropModel(Point3DModel anchor, Vector3DModel norm, Vector3DModel up,
      OfficeArtExtensionListModel extLst) {
    this.anchor = anchor;
    this.norm = norm;
    this.up = up;
    this.extLst = extLst;
  }

  public BackdropBuilder builder() {
    return new BackdropBuilder().from(this);
  }

  public Point3DModel getAnchor() {
    return this.anchor;
  }

  public Vector3DModel getNorm() {
    return this.norm;
  }

  public Vector3DModel getUp() {
    return this.up;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
