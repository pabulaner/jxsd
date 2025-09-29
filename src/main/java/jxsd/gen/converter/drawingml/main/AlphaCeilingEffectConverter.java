package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaCeilingEffectModel;
import org.docx4j.dml.CTAlphaCeilingEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaCeilingEffectConverter {
  private AlphaCeilingEffectConverter() {
  }

  public static AlphaCeilingEffectModel fromDocx4j(CTAlphaCeilingEffect value) {
    if (value == null) return null;
    return new AlphaCeilingEffectModel();
  }

  public static CTAlphaCeilingEffect toDocx4j(AlphaCeilingEffectModel value) {
    if (value == null) return null;
    CTAlphaCeilingEffect result = new CTAlphaCeilingEffect();
    return result;
  }
}
