package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TintEffectModel;
import org.docx4j.dml.CTTintEffect;

public class CT_TintEffectConverter {
  private CT_TintEffectConverter() {
  }

  public static CT_TintEffectModel fromDocx4j(CTTintEffect value) {
    if (value == null) return null;
    return new CT_TintEffectModel(ST_PositiveFixedAngleConverter.fromDocx4j(value.getHue()), ST_FixedPercentageConverter.fromDocx4j(value.getAmt()));
  }

  public static CTTintEffect toDocx4j(CT_TintEffectModel value) {
    return null;
  }
}
