package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BevelModel;
import com.scell.model.drawingml.main.CT_ColorModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_Shape3DModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import com.scell.model.drawingml.main.ST_PresetMaterialTypeModel;

public class CT_Shape3DBuilder {
  private ST_PositiveCoordinateModel contourW;

  private ST_PositiveCoordinateModel extrusionH;

  private ST_PresetMaterialTypeModel prstMaterial;

  private ST_CoordinateModel z;

  private CT_BevelModel bevelT;

  private CT_BevelModel bevelB;

  private CT_ColorModel extrusionClr;

  private CT_ColorModel contourClr;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_Shape3DBuilder() {
  }

  public CT_Shape3DBuilder setContourW(ST_PositiveCoordinateModel contourW) {
    this.contourW = contourW;
    return this;
  }

  public CT_Shape3DBuilder setExtrusionH(ST_PositiveCoordinateModel extrusionH) {
    this.extrusionH = extrusionH;
    return this;
  }

  public CT_Shape3DBuilder setPrstMaterial(ST_PresetMaterialTypeModel prstMaterial) {
    this.prstMaterial = prstMaterial;
    return this;
  }

  public CT_Shape3DBuilder setZ(ST_CoordinateModel z) {
    this.z = z;
    return this;
  }

  public CT_Shape3DBuilder setBevelT(CT_BevelModel bevelT) {
    this.bevelT = bevelT;
    return this;
  }

  public CT_Shape3DBuilder setBevelB(CT_BevelModel bevelB) {
    this.bevelB = bevelB;
    return this;
  }

  public CT_Shape3DBuilder setExtrusionClr(CT_ColorModel extrusionClr) {
    this.extrusionClr = extrusionClr;
    return this;
  }

  public CT_Shape3DBuilder setContourClr(CT_ColorModel contourClr) {
    this.contourClr = contourClr;
    return this;
  }

  public CT_Shape3DBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_Shape3DModel build() {
    return new CT_Shape3DModel(this.contourW, this.extrusionH, this.prstMaterial, this.z, this.bevelT, this.bevelB, this.extrusionClr, this.contourClr, this.extLst);
  }

  public CT_Shape3DBuilder from(CT_Shape3DModel value) {
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
