package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.EffectReferenceModel;
import org.docx4j.dml.CTEffectReference;

public class EffectReferenceConverter {
  private EffectReferenceConverter() {
  }

  public static EffectReferenceModel fromDocx4J(CTEffectReference value) {
    if (value == null) return null;
    return new EffectReferenceModel(TokenConverter.fromDocx4J(value.getRef()));
  }
}
