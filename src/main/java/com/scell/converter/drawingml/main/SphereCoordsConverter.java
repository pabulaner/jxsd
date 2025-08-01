package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SphereCoordsModel;
import org.docx4j.dml.CTSphereCoords;

public class SphereCoordsConverter {
  private SphereCoordsConverter() {
  }

  public static SphereCoordsModel fromDocx4J(CTSphereCoords value) {
    if (value == null) return null;
    return new SphereCoordsModel(PositiveFixedAngleValueConverter.fromDocx4J(value.getLat()), PositiveFixedAngleValueConverter.fromDocx4J(value.getRev()), PositiveFixedAngleValueConverter.fromDocx4J(value.getLon()));
  }
}
