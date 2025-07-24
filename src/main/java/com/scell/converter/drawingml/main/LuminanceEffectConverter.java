package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LuminanceEffectModel;
import org.docx4j.dml.CTLuminanceEffect;

public class LuminanceEffectConverter {
  private LuminanceEffectConverter() {
  }

  public static LuminanceEffectModel fromDocx4J(CTLuminanceEffect value) {
    if (value == null) return null;
    return new LuminanceEffectModel(FixedPercentageConverter.fromDocx4J(value.getContrast()), FixedPercentageConverter.fromDocx4J(value.getBright()));
  }
}
