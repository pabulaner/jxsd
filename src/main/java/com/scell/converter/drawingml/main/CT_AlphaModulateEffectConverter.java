package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaModulateEffectModel;
import org.docx4j.dml.CTAlphaModulateEffect;

public class CT_AlphaModulateEffectConverter {
  private CT_AlphaModulateEffectConverter() {
  }

  public static CT_AlphaModulateEffectModel fromDocx4J(CTAlphaModulateEffect value) {
    if (value == null) return null;
    return new CT_AlphaModulateEffectModel(CT_EffectContainerConverter.fromDocx4J(value.getCont()));
  }

  public static CTAlphaModulateEffect toDocx4J(CT_AlphaModulateEffectModel value) {
    return null;
  }
}
