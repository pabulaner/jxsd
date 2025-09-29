package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaModulateEffectModel;
import org.docx4j.dml.CTAlphaModulateEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateEffectConverter {
  private AlphaModulateEffectConverter() {
  }

  public static AlphaModulateEffectModel fromDocx4j(CTAlphaModulateEffect value) {
    if (value == null) return null;
    return new AlphaModulateEffectModel(EffectContainerConverter.fromDocx4j(value.getCont()));
  }

  public static CTAlphaModulateEffect toDocx4j(AlphaModulateEffectModel value) {
    if (value == null) return null;
    CTAlphaModulateEffect result = new CTAlphaModulateEffect();
    result.setCont(EffectContainerConverter.toDocx4j(value.getCont()));
    return result;
  }
}
