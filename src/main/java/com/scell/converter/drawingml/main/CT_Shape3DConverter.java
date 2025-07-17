package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Shape3DModel;
import org.docx4j.dml.CTShape3D;

public class CT_Shape3DConverter {
  private CT_Shape3DConverter() {
  }

  public static CT_Shape3DModel fromDocx4j(CTShape3D value) {
    if (value == null) return null;
    return new CT_Shape3DModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getContourW()), ST_PositiveCoordinateConverter.fromDocx4j(value.getExtrusionH()), ST_PresetMaterialTypeConverter.fromDocx4j(value.getPrstMaterial()), ST_CoordinateConverter.fromDocx4j(value.getZ()), CT_BevelConverter.fromDocx4j(value.getBevelT()), CT_BevelConverter.fromDocx4j(value.getBevelB()), CT_ColorConverter.fromDocx4j(value.getExtrusionClr()), CT_ColorConverter.fromDocx4j(value.getContourClr()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShape3D toDocx4j(CT_Shape3DModel value) {
    return null;
  }
}
