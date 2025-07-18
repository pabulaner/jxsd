package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BackdropModel;
import org.docx4j.dml.CTBackdrop;

public class CT_BackdropConverter {
  private CT_BackdropConverter() {
  }

  public static CT_BackdropModel fromDocx4J(CTBackdrop value) {
    if (value == null) return null;
    return new CT_BackdropModel(CT_Point3DConverter.fromDocx4J(value.getAnchor()), CT_Vector3DConverter.fromDocx4J(value.getNorm()), CT_Vector3DConverter.fromDocx4J(value.getUp()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBackdrop toDocx4J(CT_BackdropModel value) {
    return null;
  }
}
