package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GammaTransformModel;
import org.docx4j.dml.CTGammaTransform;

public class GammaTransformConverter {
  private GammaTransformConverter() {
  }

  public static GammaTransformModel fromDocx4J(CTGammaTransform value) {
    if (value == null) return null;
    return new GammaTransformModel();
  }
}
