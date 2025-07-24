package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.InverseGammaTransformModel;
import org.docx4j.dml.CTInverseGammaTransform;

public class InverseGammaTransformConverter {
  private InverseGammaTransformConverter() {
  }

  public static InverseGammaTransformModel fromDocx4J(CTInverseGammaTransform value) {
    if (value == null) return null;
    return new InverseGammaTransformModel();
  }
}
