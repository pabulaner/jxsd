package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaModulateFixedEffectModel;
import org.docx4j.dml.CTAlphaModulateFixedEffect;

public class CT_AlphaModulateFixedEffectConverter {
  private CT_AlphaModulateFixedEffectConverter() {
  }

  public static CT_AlphaModulateFixedEffectModel fromDocx4J(CTAlphaModulateFixedEffect value) {
    if (value == null) return null;
    return new CT_AlphaModulateFixedEffectModel(ST_PositivePercentageConverter.fromDocx4J(value.getAmt()));
  }

  public static CTAlphaModulateFixedEffect toDocx4J(CT_AlphaModulateFixedEffectModel value) {
    return null;
  }
}
