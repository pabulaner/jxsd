package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaFloorEffectModel;
import org.docx4j.dml.CTAlphaFloorEffect;

public class AlphaFloorEffectConverter {
  private AlphaFloorEffectConverter() {
  }

  public static AlphaFloorEffectModel fromDocx4J(CTAlphaFloorEffect value) {
    if (value == null) return null;
    return new AlphaFloorEffectModel();
  }
}
