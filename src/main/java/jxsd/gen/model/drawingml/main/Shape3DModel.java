package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Shape3DBuilder;

/**
 * This is a generated sequence class.
 */
public class Shape3DModel {
  private final long contourW;

  private final long extrusionH;

  private final PresetMaterialTypeValueModel prstMaterial;

  private final long z;

  private final BevelModel bevelT;

  private final BevelModel bevelB;

  private final ColorModel extrusionClr;

  private final ColorModel contourClr;

  private final OfficeArtExtensionListModel extLst;

  public Shape3DModel(long contourW, long extrusionH, PresetMaterialTypeValueModel prstMaterial,
      long z, BevelModel bevelT, BevelModel bevelB, ColorModel extrusionClr, ColorModel contourClr,
      OfficeArtExtensionListModel extLst) {
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

  public Shape3DBuilder builder() {
    return new Shape3DBuilder().from(this);
  }

  public long getContourW() {
    return this.contourW;
  }

  public long getExtrusionH() {
    return this.extrusionH;
  }

  public PresetMaterialTypeValueModel getPrstMaterial() {
    return this.prstMaterial;
  }

  public long getZ() {
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
