package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlendEffectModel;
import org.docx4j.dml.CTBlendEffect;

public class BlendEffectConverter {
  private BlendEffectConverter() {
  }

  public static BlendEffectModel fromDocx4J(CTBlendEffect value) {
    if (value == null) return null;
    return new BlendEffectModel(BlendModeConverter.fromDocx4J(value.getBlend()), EffectContainerConverter.fromDocx4J(value.getCont()));
  }
}
