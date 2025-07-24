package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BackdropModel;
import org.docx4j.dml.CTBackdrop;

public class BackdropConverter {
  private BackdropConverter() {
  }

  public static BackdropModel fromDocx4J(CTBackdrop value) {
    if (value == null) return null;
    return new BackdropModel(Point3DConverter.fromDocx4J(value.getAnchor()), Vector3DConverter.fromDocx4J(value.getNorm()), Vector3DConverter.fromDocx4J(value.getUp()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
