package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaBiLevelEffectModel;
import org.docx4j.dml.CTAlphaBiLevelEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaBiLevelEffectConverter {
  private AlphaBiLevelEffectConverter() {
  }

  public static AlphaBiLevelEffectModel fromDocx4j(CTAlphaBiLevelEffect value) {
    if (value == null) return null;
    return new AlphaBiLevelEffectModel(PositiveFixedPercentageValueConverter.fromDocx4j(value.getThresh()));
  }

  public static CTAlphaBiLevelEffect toDocx4j(AlphaBiLevelEffectModel value) {
    if (value == null) return null;
    CTAlphaBiLevelEffect result = new CTAlphaBiLevelEffect();
    result.setThresh(PositiveFixedPercentageValueConverter.toDocx4j(value.getThresh()));
    return result;
  }
}
