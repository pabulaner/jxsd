package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaFloorEffectModel;
import org.docx4j.dml.CTAlphaFloorEffect;

public class CT_AlphaFloorEffectConverter {
  private CT_AlphaFloorEffectConverter() {
  }

  public static CT_AlphaFloorEffectModel fromDocx4j(CTAlphaFloorEffect value) {
    if (value == null) return null;
    return new CT_AlphaFloorEffectModel();
  }

  public static CTAlphaFloorEffect toDocx4j(CT_AlphaFloorEffectModel value) {
    return null;
  }
}
