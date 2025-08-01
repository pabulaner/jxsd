package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomRectModel;
import org.docx4j.dml.CTGeomRect;

public class GeomRectConverter {
  private GeomRectConverter() {
  }

  public static GeomRectModel fromDocx4J(CTGeomRect value) {
    if (value == null) return null;
    return new GeomRectModel(AdjCoordinateValueConverter.fromDocx4J(value.getL()), AdjCoordinateValueConverter.fromDocx4J(value.getT()), AdjCoordinateValueConverter.fromDocx4J(value.getR()), AdjCoordinateValueConverter.fromDocx4J(value.getB()));
  }
}
