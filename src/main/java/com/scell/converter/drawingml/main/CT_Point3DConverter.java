package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Point3DModel;
import org.docx4j.dml.CTPoint3D;

public class CT_Point3DConverter {
  private CT_Point3DConverter() {
  }

  public static CT_Point3DModel fromDocx4J(CTPoint3D value) {
    if (value == null) return null;
    return new CT_Point3DModel(ST_CoordinateConverter.fromDocx4J(value.getY()), ST_CoordinateConverter.fromDocx4J(value.getX()), ST_CoordinateConverter.fromDocx4J(value.getZ()));
  }

  public static CTPoint3D toDocx4J(CT_Point3DModel value) {
    return null;
  }
}
