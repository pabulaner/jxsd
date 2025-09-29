package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaModulateFixedEffectModel;
import org.docx4j.dml.CTAlphaModulateFixedEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaModulateFixedEffectConverter {
  private AlphaModulateFixedEffectConverter() {
  }

  public static AlphaModulateFixedEffectModel fromDocx4j(CTAlphaModulateFixedEffect value) {
    if (value == null) return null;
    return new AlphaModulateFixedEffectModel(PositivePercentageValueConverter.fromDocx4j(value.getAmt()));
  }

  public static CTAlphaModulateFixedEffect toDocx4j(AlphaModulateFixedEffectModel value) {
    if (value == null) return null;
    CTAlphaModulateFixedEffect result = new CTAlphaModulateFixedEffect();
    result.setAmt(PositivePercentageValueConverter.toDocx4j(value.getAmt()));
    return result;
  }
}
