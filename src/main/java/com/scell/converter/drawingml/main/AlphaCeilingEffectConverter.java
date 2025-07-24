package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaCeilingEffectModel;
import org.docx4j.dml.CTAlphaCeilingEffect;

public class AlphaCeilingEffectConverter {
  private AlphaCeilingEffectConverter() {
  }

  public static AlphaCeilingEffectModel fromDocx4J(CTAlphaCeilingEffect value) {
    if (value == null) return null;
    return new AlphaCeilingEffectModel();
  }
}
