package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_InverseTransformModel;
import org.docx4j.dml.CTInverseTransform;

public class CT_InverseTransformConverter {
  private CT_InverseTransformConverter() {
  }

  public static CT_InverseTransformModel fromDocx4j(CTInverseTransform value) {
    if (value == null) return null;
    return new CT_InverseTransformModel();
  }

  public static CTInverseTransform toDocx4j(CT_InverseTransformModel value) {
    return null;
  }
}
