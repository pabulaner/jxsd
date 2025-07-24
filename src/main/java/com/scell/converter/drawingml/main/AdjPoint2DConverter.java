package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjPoint2DModel;
import org.docx4j.dml.CTAdjPoint2D;

public class AdjPoint2DConverter {
  private AdjPoint2DConverter() {
  }

  public static AdjPoint2DModel fromDocx4J(CTAdjPoint2D value) {
    if (value == null) return null;
    return new AdjPoint2DModel(AdjCoordinateConverter.fromDocx4J(value.getY()), AdjCoordinateConverter.fromDocx4J(value.getX()));
  }
}
