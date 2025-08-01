package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BiLevelEffectModel;
import org.docx4j.dml.CTBiLevelEffect;

public class BiLevelEffectConverter {
  private BiLevelEffectConverter() {
  }

  public static BiLevelEffectModel fromDocx4J(CTBiLevelEffect value) {
    if (value == null) return null;
    return new BiLevelEffectModel(PositiveFixedPercentageValueConverter.fromDocx4J(value.getThresh()));
  }
}
