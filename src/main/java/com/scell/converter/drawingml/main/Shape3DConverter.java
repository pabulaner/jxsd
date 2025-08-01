package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Shape3DModel;
import org.docx4j.dml.CTShape3D;

public class Shape3DConverter {
  private Shape3DConverter() {
  }

  public static Shape3DModel fromDocx4J(CTShape3D value) {
    if (value == null) return null;
    return new Shape3DModel(PositiveCoordinateValueConverter.fromDocx4J(value.getContourW()), PositiveCoordinateValueConverter.fromDocx4J(value.getExtrusionH()), PresetMaterialTypeValueConverter.fromDocx4J(value.getPrstMaterial()), CoordinateValueConverter.fromDocx4J(value.getZ()), BevelConverter.fromDocx4J(value.getBevelT()), BevelConverter.fromDocx4J(value.getBevelB()), ColorConverter.fromDocx4J(value.getExtrusionClr()), ColorConverter.fromDocx4J(value.getContourClr()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
