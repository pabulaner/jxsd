package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaReplaceEffectModel;
import org.docx4j.dml.CTAlphaReplaceEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaReplaceEffectConverter {
  private AlphaReplaceEffectConverter() {
  }

  public static AlphaReplaceEffectModel fromDocx4j(CTAlphaReplaceEffect value) {
    if (value == null) return null;
    return new AlphaReplaceEffectModel(PositiveFixedPercentageValueConverter.fromDocx4j(value.getA()));
  }

  public static CTAlphaReplaceEffect toDocx4j(AlphaReplaceEffectModel value) {
    if (value == null) return null;
    CTAlphaReplaceEffect result = new CTAlphaReplaceEffect();
    result.setA(PositiveFixedPercentageValueConverter.toDocx4j(value.getA()));
    return result;
  }
}
