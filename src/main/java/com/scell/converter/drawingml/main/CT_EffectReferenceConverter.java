package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.CT_EffectReferenceModel;
import org.docx4j.dml.CTEffectReference;

public class CT_EffectReferenceConverter {
  private CT_EffectReferenceConverter() {
  }

  public static CT_EffectReferenceModel fromDocx4J(CTEffectReference value) {
    if (value == null) return null;
    return new CT_EffectReferenceModel(TokenConverter.fromDocx4J(value.getRef()));
  }

  public static CTEffectReference toDocx4J(CT_EffectReferenceModel value) {
    return null;
  }
}
