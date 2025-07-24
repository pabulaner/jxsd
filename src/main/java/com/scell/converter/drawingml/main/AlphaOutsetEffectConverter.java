package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaOutsetEffectModel;
import org.docx4j.dml.CTAlphaOutsetEffect;

public class AlphaOutsetEffectConverter {
  private AlphaOutsetEffectConverter() {
  }

  public static AlphaOutsetEffectModel fromDocx4J(CTAlphaOutsetEffect value) {
    if (value == null) return null;
    return new AlphaOutsetEffectModel(CoordinateConverter.fromDocx4J(value.getRad()));
  }
}
