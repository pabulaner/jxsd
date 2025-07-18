package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GammaTransformModel;
import org.docx4j.dml.CTGammaTransform;

public class CT_GammaTransformConverter {
  private CT_GammaTransformConverter() {
  }

  public static CT_GammaTransformModel fromDocx4J(CTGammaTransform value) {
    if (value == null) return null;
    return new CT_GammaTransformModel();
  }

  public static CTGammaTransform toDocx4J(CT_GammaTransformModel value) {
    return null;
  }
}
