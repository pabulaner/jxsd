package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BlendEffectModel;
import org.docx4j.dml.CTBlendEffect;

public class CT_BlendEffectConverter {
  private CT_BlendEffectConverter() {
  }

  public static CT_BlendEffectModel fromDocx4j(CTBlendEffect value) {
    if (value == null) return null;
    return new CT_BlendEffectModel(ST_BlendModeConverter.fromDocx4j(value.getBlend()), CT_EffectContainerConverter.fromDocx4j(value.getCont()));
  }

  public static CTBlendEffect toDocx4j(CT_BlendEffectModel value) {
    return null;
  }
}
