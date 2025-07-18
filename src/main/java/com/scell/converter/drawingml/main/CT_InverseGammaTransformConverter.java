package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_InverseGammaTransformModel;
import org.docx4j.dml.CTInverseGammaTransform;

public class CT_InverseGammaTransformConverter {
  private CT_InverseGammaTransformConverter() {
  }

  public static CT_InverseGammaTransformModel fromDocx4J(CTInverseGammaTransform value) {
    if (value == null) return null;
    return new CT_InverseGammaTransformModel();
  }

  public static CTInverseGammaTransform toDocx4J(CT_InverseGammaTransformModel value) {
    return null;
  }
}
