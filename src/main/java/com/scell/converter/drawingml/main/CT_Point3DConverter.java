package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Point3DModel;
import org.docx4j.dml.CTPoint3D;

public class CT_Point3DConverter {
  private CT_Point3DConverter() {
  }

  public static CT_Point3DModel fromDocx4j(CTPoint3D value) {
    if (value == null) return null;
    return new CT_Point3DModel(ST_CoordinateConverter.fromDocx4j(value.getY()), ST_CoordinateConverter.fromDocx4j(value.getX()), ST_CoordinateConverter.fromDocx4j(value.getZ()));
  }

  public static CTPoint3D toDocx4j(CT_Point3DModel value) {
    return null;
  }
}
