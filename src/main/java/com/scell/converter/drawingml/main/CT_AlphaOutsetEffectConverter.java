package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaOutsetEffectModel;
import org.docx4j.dml.CTAlphaOutsetEffect;

public class CT_AlphaOutsetEffectConverter {
  private CT_AlphaOutsetEffectConverter() {
  }

  public static CT_AlphaOutsetEffectModel fromDocx4J(CTAlphaOutsetEffect value) {
    if (value == null) return null;
    return new CT_AlphaOutsetEffectModel(ST_CoordinateConverter.fromDocx4J(value.getRad()));
  }

  public static CTAlphaOutsetEffect toDocx4J(CT_AlphaOutsetEffectModel value) {
    return null;
  }
}
