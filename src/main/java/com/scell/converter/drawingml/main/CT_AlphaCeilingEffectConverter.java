package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaCeilingEffectModel;
import org.docx4j.dml.CTAlphaCeilingEffect;

public class CT_AlphaCeilingEffectConverter {
  private CT_AlphaCeilingEffectConverter() {
  }

  public static CT_AlphaCeilingEffectModel fromDocx4J(CTAlphaCeilingEffect value) {
    if (value == null) return null;
    return new CT_AlphaCeilingEffectModel();
  }

  public static CTAlphaCeilingEffect toDocx4J(CT_AlphaCeilingEffectModel value) {
    return null;
  }
}
