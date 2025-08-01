package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import org.docx4j.dml.CTAlphaModulateFixedEffect;

public class AlphaModulateFixedEffectConverter {
  private AlphaModulateFixedEffectConverter() {
  }

  public static AlphaModulateFixedEffectModel fromDocx4J(CTAlphaModulateFixedEffect value) {
    if (value == null) return null;
    return new AlphaModulateFixedEffectModel(PositivePercentageValueConverter.fromDocx4J(value.getAmt()));
  }
}
