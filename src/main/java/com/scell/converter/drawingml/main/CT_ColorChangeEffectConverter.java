package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ColorChangeEffectModel;
import org.docx4j.dml.CTColorChangeEffect;

public class CT_ColorChangeEffectConverter {
  private CT_ColorChangeEffectConverter() {
  }

  public static CT_ColorChangeEffectModel fromDocx4j(CTColorChangeEffect value) {
    if (value == null) return null;
    return new CT_ColorChangeEffectModel(BooleanConverter.fromDocx4j(value.getUseA()), CT_ColorConverter.fromDocx4j(value.getClrFrom()), CT_ColorConverter.fromDocx4j(value.getClrTo()));
  }

  public static CTColorChangeEffect toDocx4j(CT_ColorChangeEffectModel value) {
    return null;
  }
}
