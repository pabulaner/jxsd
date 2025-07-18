package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BiLevelEffectModel;
import org.docx4j.dml.CTBiLevelEffect;

public class CT_BiLevelEffectConverter {
  private CT_BiLevelEffectConverter() {
  }

  public static CT_BiLevelEffectModel fromDocx4J(CTBiLevelEffect value) {
    if (value == null) return null;
    return new CT_BiLevelEffectModel(ST_PositiveFixedPercentageConverter.fromDocx4J(value.getThresh()));
  }

  public static CTBiLevelEffect toDocx4J(CT_BiLevelEffectModel value) {
    return null;
  }
}
