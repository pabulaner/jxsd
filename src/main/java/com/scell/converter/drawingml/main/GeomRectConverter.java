package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomRectModel;
import org.docx4j.dml.CTGeomRect;

public class GeomRectConverter {
  private GeomRectConverter() {
  }

  public static GeomRectModel fromDocx4J(CTGeomRect value) {
    if (value == null) return null;
    return new GeomRectModel(AdjCoordinateConverter.fromDocx4J(value.getL()), AdjCoordinateConverter.fromDocx4J(value.getT()), AdjCoordinateConverter.fromDocx4J(value.getR()), AdjCoordinateConverter.fromDocx4J(value.getB()));
  }
}
