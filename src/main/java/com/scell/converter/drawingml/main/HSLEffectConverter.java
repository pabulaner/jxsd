package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.HSLEffectModel;
import org.docx4j.dml.CTHSLEffect;

public class HSLEffectConverter {
  private HSLEffectConverter() {
  }

  public static HSLEffectModel fromDocx4J(CTHSLEffect value) {
    if (value == null) return null;
    return new HSLEffectModel(PositiveFixedAngleConverter.fromDocx4J(value.getHue()), FixedPercentageConverter.fromDocx4J(value.getLum()), FixedPercentageConverter.fromDocx4J(value.getSat()));
  }
}
