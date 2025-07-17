package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_HSLEffectModel;
import org.docx4j.dml.CTHSLEffect;

public class CT_HSLEffectConverter {
  private CT_HSLEffectConverter() {
  }

  public static CT_HSLEffectModel fromDocx4j(CTHSLEffect value) {
    if (value == null) return null;
    return new CT_HSLEffectModel(ST_PositiveFixedAngleConverter.fromDocx4j(value.getHue()), ST_FixedPercentageConverter.fromDocx4j(value.getLum()), ST_FixedPercentageConverter.fromDocx4j(value.getSat()));
  }

  public static CTHSLEffect toDocx4j(CT_HSLEffectModel value) {
    return null;
  }
}
