package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Point3DModel;
import org.docx4j.dml.CTPoint3D;

public class Point3DConverter {
  private Point3DConverter() {
  }

  public static Point3DModel fromDocx4J(CTPoint3D value) {
    if (value == null) return null;
    return new Point3DModel(CoordinateValueConverter.fromDocx4J(value.getY()), CoordinateValueConverter.fromDocx4J(value.getX()), CoordinateValueConverter.fromDocx4J(value.getZ()));
  }
}
