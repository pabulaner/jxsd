package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.ColorChangeEffectModel;
import org.docx4j.dml.CTColorChangeEffect;

public class ColorChangeEffectConverter {
  private ColorChangeEffectConverter() {
  }

  public static ColorChangeEffectModel fromDocx4J(CTColorChangeEffect value) {
    if (value == null) return null;
    return new ColorChangeEffectModel(BooleanConverter.fromDocx4J(value.isUseA()), ColorConverter.fromDocx4J(value.getClrFrom()), ColorConverter.fromDocx4J(value.getClrTo()));
  }
}
