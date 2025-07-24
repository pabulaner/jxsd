package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GrayscaleEffectModel;
import org.docx4j.dml.CTGrayscaleEffect;

public class GrayscaleEffectConverter {
  private GrayscaleEffectConverter() {
  }

  public static GrayscaleEffectModel fromDocx4J(CTGrayscaleEffect value) {
    if (value == null) return null;
    return new GrayscaleEffectModel();
  }
}
