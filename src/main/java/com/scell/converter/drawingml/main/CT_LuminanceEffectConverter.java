package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LuminanceEffectModel;
import org.docx4j.dml.CTLuminanceEffect;

public class CT_LuminanceEffectConverter {
  private CT_LuminanceEffectConverter() {
  }

  public static CT_LuminanceEffectModel fromDocx4J(CTLuminanceEffect value) {
    if (value == null) return null;
    return new CT_LuminanceEffectModel(ST_FixedPercentageConverter.fromDocx4J(value.getContrast()), ST_FixedPercentageConverter.fromDocx4J(value.getBright()));
  }

  public static CTLuminanceEffect toDocx4J(CT_LuminanceEffectModel value) {
    return null;
  }
}
