package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveSize2DModel;
import org.docx4j.dml.CTPositiveSize2D;

public class PositiveSize2DConverter {
  private PositiveSize2DConverter() {
  }

  public static PositiveSize2DModel fromDocx4J(CTPositiveSize2D value) {
    if (value == null) return null;
    return new PositiveSize2DModel(PositiveCoordinateValueConverter.fromDocx4J(value.getCy()), PositiveCoordinateValueConverter.fromDocx4J(value.getCx()));
  }
}
