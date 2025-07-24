package com.scell.model.drawingml.main;

public class Shape3DModel {
  private final PositiveCoordinateModel contourW;

  private final PositiveCoordinateModel extrusionH;

  private final PresetMaterialTypeModel prstMaterial;

  private final CoordinateModel z;

  private final BevelModel bevelT;

  private final BevelModel bevelB;

  private final ColorModel extrusionClr;

  private final ColorModel contourClr;

  private final OfficeArtExtensionListModel extLst;

  public Shape3DModel(PositiveCoordinateModel contourW, PositiveCoordinateModel extrusionH,
      PresetMaterialTypeModel prstMaterial, CoordinateModel z, BevelModel bevelT, BevelModel bevelB,
      ColorModel extrusionClr, ColorModel contourClr, OfficeArtExtensionListModel extLst) {
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

  public PositiveCoordinateModel getContourW() {
    return this.contourW;
  }

  public PositiveCoordinateModel getExtrusionH() {
    return this.extrusionH;
  }

  public PresetMaterialTypeModel getPrstMaterial() {
    return this.prstMaterial;
  }

  public CoordinateModel getZ() {
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
