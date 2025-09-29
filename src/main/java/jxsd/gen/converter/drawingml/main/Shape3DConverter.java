package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Shape3DModel;
import org.docx4j.dml.CTShape3D;

/**
 * This is a generated sequence class.
 */
public class Shape3DConverter {
  private Shape3DConverter() {
  }

  public static Shape3DModel fromDocx4j(CTShape3D value) {
    if (value == null) return null;
    return new Shape3DModel(PositiveCoordinateValueConverter.fromDocx4j(value.getContourW()), PositiveCoordinateValueConverter.fromDocx4j(value.getExtrusionH()), PresetMaterialTypeValueConverter.fromDocx4j(value.getPrstMaterial()), CoordinateValueConverter.fromDocx4j(value.getZ()), BevelConverter.fromDocx4j(value.getBevelT()), BevelConverter.fromDocx4j(value.getBevelB()), ColorConverter.fromDocx4j(value.getExtrusionClr()), ColorConverter.fromDocx4j(value.getContourClr()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShape3D toDocx4j(Shape3DModel value) {
    if (value == null) return null;
    CTShape3D result = new CTShape3D();
    result.setContourW(PositiveCoordinateValueConverter.toDocx4j(value.getContourW()));
    result.setExtrusionH(PositiveCoordinateValueConverter.toDocx4j(value.getExtrusionH()));
    result.setPrstMaterial(PresetMaterialTypeValueConverter.toDocx4j(value.getPrstMaterial()));
    result.setZ(CoordinateValueConverter.toDocx4j(value.getZ()));
    result.setBevelT(BevelConverter.toDocx4j(value.getBevelT()));
    result.setBevelB(BevelConverter.toDocx4j(value.getBevelB()));
    result.setExtrusionClr(ColorConverter.toDocx4j(value.getExtrusionClr()));
    result.setContourClr(ColorConverter.toDocx4j(value.getContourClr()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
