package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomRectModel;
import org.docx4j.dml.CTGeomRect;

public class CT_GeomRectConverter {
  private CT_GeomRectConverter() {
  }

  public static CT_GeomRectModel fromDocx4J(CTGeomRect value) {
    if (value == null) return null;
    return new CT_GeomRectModel(ST_AdjCoordinateConverter.fromDocx4J(value.getL()), ST_AdjCoordinateConverter.fromDocx4J(value.getT()), ST_AdjCoordinateConverter.fromDocx4J(value.getR()), ST_AdjCoordinateConverter.fromDocx4J(value.getB()));
  }

  public static CTGeomRect toDocx4J(CT_GeomRectModel value) {
    return null;
  }
}
