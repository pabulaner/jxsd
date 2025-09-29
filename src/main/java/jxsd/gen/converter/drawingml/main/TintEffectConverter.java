package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TintEffectModel;
import org.docx4j.dml.CTTintEffect;

/**
 * This is a generated sequence class.
 */
public class TintEffectConverter {
  private TintEffectConverter() {
  }

  public static TintEffectModel fromDocx4j(CTTintEffect value) {
    if (value == null) return null;
    return new TintEffectModel(PositiveFixedAngleValueConverter.fromDocx4j(value.getHue()), FixedPercentageValueConverter.fromDocx4j(value.getAmt()));
  }

  public static CTTintEffect toDocx4j(TintEffectModel value) {
    if (value == null) return null;
    CTTintEffect result = new CTTintEffect();
    result.setHue(PositiveFixedAngleValueConverter.toDocx4j(value.getHue()));
    result.setAmt(FixedPercentageValueConverter.toDocx4j(value.getAmt()));
    return result;
  }
}
