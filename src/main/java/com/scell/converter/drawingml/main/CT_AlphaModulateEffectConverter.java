package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaModulateEffectModel;
import org.docx4j.dml.CTAlphaModulateEffect;

public class CT_AlphaModulateEffectConverter {
  private CT_AlphaModulateEffectConverter() {
  }

  public static CT_AlphaModulateEffectModel fromDocx4j(CTAlphaModulateEffect value) {
    if (value == null) return null;
    return new CT_AlphaModulateEffectModel(CT_EffectContainerConverter.fromDocx4j(value.getCont()));
  }

  public static CTAlphaModulateEffect toDocx4j(CT_AlphaModulateEffectModel value) {
    return null;
  }
}
