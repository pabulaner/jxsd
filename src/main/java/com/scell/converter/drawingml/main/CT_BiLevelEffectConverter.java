package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BiLevelEffectModel;
import org.docx4j.dml.CTBiLevelEffect;

public class CT_BiLevelEffectConverter {
  private CT_BiLevelEffectConverter() {
  }

  public static CT_BiLevelEffectModel fromDocx4j(CTBiLevelEffect value) {
    if (value == null) return null;
    return new CT_BiLevelEffectModel(ST_PositiveFixedPercentageConverter.fromDocx4j(value.getThresh()));
  }

  public static CTBiLevelEffect toDocx4j(CT_BiLevelEffectModel value) {
    return null;
  }
}
