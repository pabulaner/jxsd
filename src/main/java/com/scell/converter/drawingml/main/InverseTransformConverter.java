package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.InverseTransformModel;
import org.docx4j.dml.CTInverseTransform;

public class InverseTransformConverter {
  private InverseTransformConverter() {
  }

  public static InverseTransformModel fromDocx4J(CTInverseTransform value) {
    if (value == null) return null;
    return new InverseTransformModel();
  }
}
