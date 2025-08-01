package com.scell.model.drawingml.main;

public class Shape3DModel {
  private final PositiveCoordinateValueModel contourW;

  private final PositiveCoordinateValueModel extrusionH;

  private final PresetMaterialTypeValueModel prstMaterial;

  private final CoordinateValueModel z;

  private final BevelModel bevelT;

  private final BevelModel bevelB;

  private final ColorModel extrusionClr;

  private final ColorModel contourClr;

  private final OfficeArtExtensionListModel extLst;

  public Shape3DModel(PositiveCoordinateValueModel contourW,
      PositiveCoordinateValueModel extrusionH, PresetMaterialTypeValueModel prstMaterial,
      CoordinateValueModel z, BevelModel bevelT, BevelModel bevelB, ColorModel extrusionClr,
      ColorModel contourClr, OfficeArtExtensionListModel extLst) {
    this.contourW = contourW;
    this.extrusionH = extrusionH;
    this.prstMaterial = prstMaterial;
    this.z = z;
    this.bevelT = bevelT;
    this.bevelB = bevelB;
    this.extrusionClr = extrusionClr;
    this.contourClr = contourClr;
    this.extLst = extLst;
  }

  public PositiveCoordinateValueModel getContourW() {
    return this.contourW;
  }

  public PositiveCoordinateValueModel getExtrusionH() {
    return this.extrusionH;
  }

  public PresetMaterialTypeValueModel getPrstMaterial() {
    return this.prstMaterial;
  }

  public CoordinateValueModel getZ() {
    return this.z;
  }

  public BevelModel getBevelT() {
    return this.bevelT;
  }

  public BevelModel getBevelB() {
    return this.bevelB;
  }

  public ColorModel getExtrusionClr() {
    return this.extrusionClr;
  }

  public ColorModel getContourClr() {
    return this.contourClr;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
