package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Point2DModel;
import org.docx4j.dml.CTPoint2D;

public class Point2DConverter {
  private Point2DConverter() {
  }

  public static Point2DModel fromDocx4J(CTPoint2D value) {
    if (value == null) return null;
    return new Point2DModel(CoordinateValueConverter.fromDocx4J(value.getY()), CoordinateValueConverter.fromDocx4J(value.getX()));
  }
}
