package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BackdropModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.Point3DModel;
import com.scell.model.drawingml.main.Vector3DModel;

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

  public BackdropModel build() {
    return new BackdropModel(this.anchor, this.norm, this.up, this.extLst);
  }

  public BackdropBuilder from(BackdropModel value) {
    this.anchor = value.getAnchor();
    this.norm = value.getNorm();
    this.up = value.getUp();
    this.extLst = value.getExtLst();
    return this;
  }
}
