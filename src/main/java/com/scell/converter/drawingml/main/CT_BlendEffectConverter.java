package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BlendEffectModel;
import org.docx4j.dml.CTBlendEffect;

public class CT_BlendEffectConverter {
  private CT_BlendEffectConverter() {
  }

  public static CT_BlendEffectModel fromDocx4J(CTBlendEffect value) {
    if (value == null) return null;
    return new CT_BlendEffectModel(ST_BlendModeConverter.fromDocx4J(value.getBlend()), CT_EffectContainerConverter.fromDocx4J(value.getCont()));
  }

  public static CTBlendEffect toDocx4J(CT_BlendEffectModel value) {
    return null;
  }
}
