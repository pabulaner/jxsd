package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.HSLEffectModel;
import org.docx4j.dml.CTHSLEffect;

/**
 * This is a generated sequence class.
 */
public class HSLEffectConverter {
  private HSLEffectConverter() {
  }

  public static HSLEffectModel fromDocx4j(CTHSLEffect value) {
    if (value == null) return null;
    return new HSLEffectModel(PositiveFixedAngleValueConverter.fromDocx4j(value.getHue()), FixedPercentageValueConverter.fromDocx4j(value.getLum()), FixedPercentageValueConverter.fromDocx4j(value.getSat()));
  }

  public static CTHSLEffect toDocx4j(HSLEffectModel value) {
    if (value == null) return null;
    CTHSLEffect result = new CTHSLEffect();
    result.setHue(PositiveFixedAngleValueConverter.toDocx4j(value.getHue()));
    result.setLum(FixedPercentageValueConverter.toDocx4j(value.getLum()));
    result.setSat(FixedPercentageValueConverter.toDocx4j(value.getSat()));
    return result;
  }
}
