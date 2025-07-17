package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaReplaceEffectModel;
import org.docx4j.dml.CTAlphaReplaceEffect;

public class CT_AlphaReplaceEffectConverter {
  private CT_AlphaReplaceEffectConverter() {
  }

  public static CT_AlphaReplaceEffectModel fromDocx4j(CTAlphaReplaceEffect value) {
    if (value == null) return null;
    return new CT_AlphaReplaceEffectModel(ST_PositiveFixedPercentageConverter.fromDocx4j(value.getA()));
  }

  public static CTAlphaReplaceEffect toDocx4j(CT_AlphaReplaceEffectModel value) {
    return null;
  }
}
