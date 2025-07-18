package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Vector3DModel;
import org.docx4j.dml.CTVector3D;

public class CT_Vector3DConverter {
  private CT_Vector3DConverter() {
  }

  public static CT_Vector3DModel fromDocx4J(CTVector3D value) {
    if (value == null) return null;
    return new CT_Vector3DModel(ST_CoordinateConverter.fromDocx4J(value.getDz()), ST_CoordinateConverter.fromDocx4J(value.getDy()), ST_CoordinateConverter.fromDocx4J(value.getDx()));
  }

  public static CTVector3D toDocx4J(CT_Vector3DModel value) {
    return null;
  }
}
