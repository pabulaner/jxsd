package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import org.docx4j.dml.CTAlphaBiLevelEffect;

public class AlphaBiLevelEffectConverter {
  private AlphaBiLevelEffectConverter() {
  }

  public static AlphaBiLevelEffectModel fromDocx4J(CTAlphaBiLevelEffect value) {
    if (value == null) return null;
    return new AlphaBiLevelEffectModel(PositiveFixedPercentageValueConverter.fromDocx4J(value.getThresh()));
  }
}
