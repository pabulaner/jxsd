package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TintEffectModel;
import org.docx4j.dml.CTTintEffect;

public class CT_TintEffectConverter {
  private CT_TintEffectConverter() {
  }

  public static CT_TintEffectModel fromDocx4J(CTTintEffect value) {
    if (value == null) return null;
    return new CT_TintEffectModel(ST_PositiveFixedAngleConverter.fromDocx4J(value.getHue()), ST_FixedPercentageConverter.fromDocx4J(value.getAmt()));
  }

  public static CTTintEffect toDocx4J(CT_TintEffectModel value) {
    return null;
  }
}
