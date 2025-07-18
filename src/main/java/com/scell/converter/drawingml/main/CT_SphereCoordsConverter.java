package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SphereCoordsModel;
import org.docx4j.dml.CTSphereCoords;

public class CT_SphereCoordsConverter {
  private CT_SphereCoordsConverter() {
  }

  public static CT_SphereCoordsModel fromDocx4J(CTSphereCoords value) {
    if (value == null) return null;
    return new CT_SphereCoordsModel(ST_PositiveFixedAngleConverter.fromDocx4J(value.getLat()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getRev()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getLon()));
  }

  public static CTSphereCoords toDocx4J(CT_SphereCoordsModel value) {
    return null;
  }
}
