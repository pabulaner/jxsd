package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.TokenValueConverter;
import jxsd.gen.model.drawingml.main.EffectReferenceModel;
import org.docx4j.dml.CTEffectReference;

/**
 * This is a generated sequence class.
 */
public class EffectReferenceConverter {
  private EffectReferenceConverter() {
  }

  public static EffectReferenceModel fromDocx4j(CTEffectReference value) {
    if (value == null) return null;
    return new EffectReferenceModel(TokenValueConverter.fromDocx4j(value.getRef()));
  }

  public static CTEffectReference toDocx4j(EffectReferenceModel value) {
    if (value == null) return null;
    CTEffectReference result = new CTEffectReference();
    result.setRef(TokenValueConverter.toDocx4j(value.getRef()));
    return result;
  }
}
