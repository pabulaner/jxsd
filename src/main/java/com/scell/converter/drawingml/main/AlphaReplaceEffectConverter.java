package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import org.docx4j.dml.CTAlphaReplaceEffect;

public class AlphaReplaceEffectConverter {
  private AlphaReplaceEffectConverter() {
  }

  public static AlphaReplaceEffectModel fromDocx4J(CTAlphaReplaceEffect value) {
    if (value == null) return null;
    return new AlphaReplaceEffectModel(PositiveFixedPercentageValueConverter.fromDocx4J(value.getA()));
  }
}
