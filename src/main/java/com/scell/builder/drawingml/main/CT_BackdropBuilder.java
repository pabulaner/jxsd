package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BackdropModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_Point3DModel;
import com.scell.model.drawingml.main.CT_Vector3DModel;

public class CT_BackdropBuilder {
  private CT_Point3DModel anchor;

  private CT_Vector3DModel norm;

  private CT_Vector3DModel up;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_BackdropBuilder() {
  }

  public CT_BackdropBuilder setAnchor(CT_Point3DModel anchor) {
    this.anchor = anchor;
    return this;
  }

  public CT_BackdropBuilder setNorm(CT_Vector3DModel norm) {
    this.norm = norm;
    return this;
  }

  public CT_BackdropBuilder setUp(CT_Vector3DModel up) {
    this.up = up;
    return this;
  }

  public CT_BackdropBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BackdropModel build() {
    return new CT_BackdropModel(this.anchor, this.norm, this.up, this.extLst);
  }

  public CT_BackdropBuilder from(CT_BackdropModel value) {
    this.anchor = value.getAnchor();
    this.norm = value.getNorm();
    this.up = value.getUp();
    this.extLst = value.getExtLst();
    return this;
  }
}
