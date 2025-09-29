package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.BlendEffectModel;
import org.docx4j.dml.CTBlendEffect;

/**
 * This is a generated sequence class.
 */
public class BlendEffectConverter {
  private BlendEffectConverter() {
  }

  public static BlendEffectModel fromDocx4j(CTBlendEffect value) {
    if (value == null) return null;
    return new BlendEffectModel(BlendModeValueConverter.fromDocx4j(value.getBlend()), EffectContainerConverter.fromDocx4j(value.getCont()));
  }

  public static CTBlendEffect toDocx4j(BlendEffectModel value) {
    if (value == null) return null;
    CTBlendEffect result = new CTBlendEffect();
    result.setBlend(BlendModeValueConverter.toDocx4j(value.getBlend()));
    result.setCont(EffectContainerConverter.toDocx4j(value.getCont()));
    return result;
  }
}
