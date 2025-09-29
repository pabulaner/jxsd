package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BackdropModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.Point3DModel;
import jxsd.gen.model.drawingml.main.Vector3DModel;

/**
 * This is a generated sequence class.
 */
public class BackdropBuilder {
  private Point3DModel anchor;

  private Vector3DModel norm;

  private Vector3DModel up;

  private OfficeArtExtensionListModel extLst;

  public BackdropBuilder() {
  }

  public BackdropBuilder setAnchor(Point3DModel anchor) {
    this.anchor = anchor;
    return this;
  }

  public BackdropBuilder setNorm(Vector3DModel norm) {
    this.norm = norm;
    return this;
  }

  public BackdropBuilder setUp(Vector3DModel up) {
    this.up = up;
    return this;
  }

  public BackdropBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BackdropBuilder from(BackdropModel value) {
    this.anchor = value.getAnchor();
    this.norm = value.getNorm();
    this.up = value.getUp();
    this.extLst = value.getExtLst();
    return this;
  }

  public BackdropModel build() {
    return new BackdropModel(this.anchor, this.norm, this.up, this.extLst);
  }
}
