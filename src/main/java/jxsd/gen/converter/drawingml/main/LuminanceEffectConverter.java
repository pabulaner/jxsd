package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LuminanceEffectModel;
import org.docx4j.dml.CTLuminanceEffect;

/**
 * This is a generated sequence class.
 */
public class LuminanceEffectConverter {
  private LuminanceEffectConverter() {
  }

  public static LuminanceEffectModel fromDocx4j(CTLuminanceEffect value) {
    if (value == null) return null;
    return new LuminanceEffectModel(FixedPercentageValueConverter.fromDocx4j(value.getContrast()), FixedPercentageValueConverter.fromDocx4j(value.getBright()));
  }

  public static CTLuminanceEffect toDocx4j(LuminanceEffectModel value) {
    if (value == null) return null;
    CTLuminanceEffect result = new CTLuminanceEffect();
    result.setContrast(FixedPercentageValueConverter.toDocx4j(value.getContrast()));
    result.setBright(FixedPercentageValueConverter.toDocx4j(value.getBright()));
    return result;
  }
}
