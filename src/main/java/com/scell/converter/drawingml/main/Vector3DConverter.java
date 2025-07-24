package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Vector3DModel;
import org.docx4j.dml.CTVector3D;

public class Vector3DConverter {
  private Vector3DConverter() {
  }

  public static Vector3DModel fromDocx4J(CTVector3D value) {
    if (value == null) return null;
    return new Vector3DModel(CoordinateConverter.fromDocx4J(value.getDz()), CoordinateConverter.fromDocx4J(value.getDy()), CoordinateConverter.fromDocx4J(value.getDx()));
  }
}
