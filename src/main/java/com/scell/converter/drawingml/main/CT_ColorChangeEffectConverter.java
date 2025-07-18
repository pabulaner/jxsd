package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ColorChangeEffectModel;
import org.docx4j.dml.CTColorChangeEffect;

public class CT_ColorChangeEffectConverter {
  private CT_ColorChangeEffectConverter() {
  }

  public static CT_ColorChangeEffectModel fromDocx4J(CTColorChangeEffect value) {
    if (value == null) return null;
    return new CT_ColorChangeEffectModel(BooleanConverter.fromDocx4J(value.getUseA()), CT_ColorConverter.fromDocx4J(value.getClrFrom()), CT_ColorConverter.fromDocx4J(value.getClrTo()));
  }

  public static CTColorChangeEffect toDocx4J(CT_ColorChangeEffectModel value) {
    return null;
  }
}
