package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SphereCoordsModel;
import org.docx4j.dml.CTSphereCoords;

public class CT_SphereCoordsConverter {
  private CT_SphereCoordsConverter() {
  }

  public static CT_SphereCoordsModel fromDocx4j(CTSphereCoords value) {
    if (value == null) return null;
    return new CT_SphereCoordsModel(ST_PositiveFixedAngleConverter.fromDocx4j(value.getLat()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getRev()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getLon()));
  }

  public static CTSphereCoords toDocx4j(CT_SphereCoordsModel value) {
    return null;
  }
}
