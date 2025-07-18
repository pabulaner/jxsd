package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Shape3DModel;
import org.docx4j.dml.CTShape3D;

public class CT_Shape3DConverter {
  private CT_Shape3DConverter() {
  }

  public static CT_Shape3DModel fromDocx4J(CTShape3D value) {
    if (value == null) return null;
    return new CT_Shape3DModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getContourW()), ST_PositiveCoordinateConverter.fromDocx4J(value.getExtrusionH()), ST_PresetMaterialTypeConverter.fromDocx4J(value.getPrstMaterial()), ST_CoordinateConverter.fromDocx4J(value.getZ()), CT_BevelConverter.fromDocx4J(value.getBevelT()), CT_BevelConverter.fromDocx4J(value.getBevelB()), CT_ColorConverter.fromDocx4J(value.getExtrusionClr()), CT_ColorConverter.fromDocx4J(value.getContourClr()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTShape3D toDocx4J(CT_Shape3DModel value) {
    return null;
  }
}
