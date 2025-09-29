package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BevelModel;
import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PresetMaterialTypeValueModel;
import jxsd.gen.model.drawingml.main.Shape3DModel;

/**
 * This is a generated sequence class.
 */
public class Shape3DBuilder {
  private long contourW;

  private long extrusionH;

  private PresetMaterialTypeValueModel prstMaterial;

  private long z;

  private BevelModel bevelT;

  private BevelModel bevelB;

  private ColorModel extrusionClr;

  private ColorModel contourClr;

  private OfficeArtExtensionListModel extLst;

  public Shape3DBuilder() {
  }

  public Shape3DBuilder setContourW(long contourW) {
    this.contourW = contourW;
    return this;
  }

  public Shape3DBuilder setExtrusionH(long extrusionH) {
    this.extrusionH = extrusionH;
    return this;
  }

  public Shape3DBuilder setPrstMaterial(PresetMaterialTypeValueModel prstMaterial) {
    this.prstMaterial = prstMaterial;
    return this;
  }

  public Shape3DBuilder setZ(long z) {
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

  public Shape3DModel build() {
    return new Shape3DModel(this.contourW, this.extrusionH, this.prstMaterial, this.z, this.bevelT, this.bevelB, this.extrusionClr, this.contourClr, this.extLst);
  }
}
