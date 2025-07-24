package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BevelModel;
import com.scell.model.drawingml.main.ColorModel;
import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PositiveCoordinateModel;
import com.scell.model.drawingml.main.PresetMaterialTypeModel;
import com.scell.model.drawingml.main.Shape3DModel;

public class Shape3DBuilder {
  private PositiveCoordinateModel contourW;

  private PositiveCoordinateModel extrusionH;

  private PresetMaterialTypeModel prstMaterial;

  private CoordinateModel z;

  private BevelModel bevelT;

  private BevelModel bevelB;

  private ColorModel extrusionClr;

  private ColorModel contourClr;

  private OfficeArtExtensionListModel extLst;

  public Shape3DBuilder() {
  }

  public Shape3DBuilder setContourW(PositiveCoordinateModel contourW) {
    this.contourW = contourW;
    return this;
  }

  public Shape3DBuilder setExtrusionH(PositiveCoordinateModel extrusionH) {
    this.extrusionH = extrusionH;
    return this;
  }

  public Shape3DBuilder setPrstMaterial(PresetMaterialTypeModel prstMaterial) {
    this.prstMaterial = prstMaterial;
    return this;
  }

  public Shape3DBuilder setZ(CoordinateModel z) {
    this.z = z;
    return this;
  }

  public Shape3DBuilder setBevelT(BevelModel bevelT) {
    this.bevelT = bevelT;
    return this;
  }

  public Shape3DBuilder setBevelB(BevelModel bevelB) {
    this.bevelB = bevelB;
    return this;
  }

  public Shape3DBuilder setExtrusionClr(ColorModel extrusionClr) {
    this.extrusionClr = extrusionClr;
    return this;
  }

  public Shape3DBuilder setContourClr(ColorModel contourClr) {
    this.contourClr = contourClr;
    return this;
  }

  public Shape3DBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Shape3DModel build() {
    return new Shape3DModel(this.contourW, this.extrusionH, this.prstMaterial, this.z, this.bevelT, this.bevelB, this.extrusionClr, this.contourClr, this.extLst);
  }

  public Shape3DBuilder from(Shape3DModel value) {
    this.contourW = value.getContourW();
    this.extrusionH = value.getExtrusionH();
    this.prstMaterial = value.getPrstMaterial();
    this.z = value.getZ();
    this.bevelT = value.getBevelT();
    this.bevelB = value.getBevelB();
    this.extrusionClr = value.getExtrusionClr();
    this.contourClr = value.getContourClr();
    this.extLst = value.getExtLst();
    return this;
  }
}
