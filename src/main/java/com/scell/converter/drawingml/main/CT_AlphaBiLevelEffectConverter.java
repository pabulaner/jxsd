package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaBiLevelEffectModel;
import org.docx4j.dml.CTAlphaBiLevelEffect;

public class CT_AlphaBiLevelEffectConverter {
  private CT_AlphaBiLevelEffectConverter() {
  }

  public static CT_AlphaBiLevelEffectModel fromDocx4J(CTAlphaBiLevelEffect value) {
    if (value == null) return null;
    return new CT_AlphaBiLevelEffectModel(ST_PositiveFixedPercentageConverter.fromDocx4J(value.getThresh()));
  }

  public static CTAlphaBiLevelEffect toDocx4J(CT_AlphaBiLevelEffectModel value) {
    return null;
  }
}
