package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.BiLevelEffectModel;
import org.docx4j.dml.CTBiLevelEffect;

/**
 * This is a generated sequence class.
 */
public class BiLevelEffectConverter {
  private BiLevelEffectConverter() {
  }

  public static BiLevelEffectModel fromDocx4j(CTBiLevelEffect value) {
    if (value == null) return null;
    return new BiLevelEffectModel(PositiveFixedPercentageValueConverter.fromDocx4j(value.getThresh()));
  }

  public static CTBiLevelEffect toDocx4j(BiLevelEffectModel value) {
    if (value == null) return null;
    CTBiLevelEffect result = new CTBiLevelEffect();
    result.setThresh(PositiveFixedPercentageValueConverter.toDocx4j(value.getThresh()));
    return result;
  }
}
