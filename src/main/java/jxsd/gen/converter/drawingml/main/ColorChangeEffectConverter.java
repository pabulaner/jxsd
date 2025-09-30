package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.ColorChangeEffectModel;
import org.docx4j.dml.CTColorChangeEffect;

/**
 * This is a generated sequence class.
 */
public class ColorChangeEffectConverter {
  private ColorChangeEffectConverter() {
  }

  public static ColorChangeEffectModel fromDocx4j(CTColorChangeEffect value) {
    if (value == null) return null;
    return new ColorChangeEffectModel(BooleanValueConverter.fromDocx4j(value.isUseA()), ColorConverter.fromDocx4j(value.getClrFrom()), ColorConverter.fromDocx4j(value.getClrTo()));
  }

  public static CTColorChangeEffect toDocx4j(ColorChangeEffectModel value) {
    if (value == null) return null;
    CTColorChangeEffect result = new CTColorChangeEffect();
    result.setUseA(BooleanValueConverter.toDocx4j(value.getUseA()));
    result.setClrFrom(ColorConverter.toDocx4j(value.getClrFrom()));
    result.setClrTo(ColorConverter.toDocx4j(value.getClrTo()));
    return result;
  }
}
