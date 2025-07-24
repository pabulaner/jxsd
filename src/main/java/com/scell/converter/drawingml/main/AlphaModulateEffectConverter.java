package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaModulateEffectModel;
import org.docx4j.dml.CTAlphaModulateEffect;

public class AlphaModulateEffectConverter {
  private AlphaModulateEffectConverter() {
  }

  public static AlphaModulateEffectModel fromDocx4J(CTAlphaModulateEffect value) {
    if (value == null) return null;
    return new AlphaModulateEffectModel(EffectContainerConverter.fromDocx4J(value.getCont()));
  }
}
