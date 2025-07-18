package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_HSLEffectModel;
import org.docx4j.dml.CTHSLEffect;

public class CT_HSLEffectConverter {
  private CT_HSLEffectConverter() {
  }

  public static CT_HSLEffectModel fromDocx4J(CTHSLEffect value) {
    if (value == null) return null;
    return new CT_HSLEffectModel(ST_PositiveFixedAngleConverter.fromDocx4J(value.getHue()), ST_FixedPercentageConverter.fromDocx4J(value.getLum()), ST_FixedPercentageConverter.fromDocx4J(value.getSat()));
  }

  public static CTHSLEffect toDocx4J(CT_HSLEffectModel value) {
    return null;
  }
}
