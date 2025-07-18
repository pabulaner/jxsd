package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GrayscaleEffectModel;
import org.docx4j.dml.CTGrayscaleEffect;

public class CT_GrayscaleEffectConverter {
  private CT_GrayscaleEffectConverter() {
  }

  public static CT_GrayscaleEffectModel fromDocx4J(CTGrayscaleEffect value) {
    if (value == null) return null;
    return new CT_GrayscaleEffectModel();
  }

  public static CTGrayscaleEffect toDocx4J(CT_GrayscaleEffectModel value) {
    return null;
  }
}
