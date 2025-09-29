package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.BlurEffectModel;
import org.docx4j.dml.CTBlurEffect;

/**
 * This is a generated sequence class.
 */
public class BlurEffectConverter {
  private BlurEffectConverter() {
  }

  public static BlurEffectModel fromDocx4j(CTBlurEffect value) {
    if (value == null) return null;
    return new BlurEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getRad()), BooleanValueConverter.fromDocx4j(value.getGrow()));
  }

  public static CTBlurEffect toDocx4j(BlurEffectModel value) {
    if (value == null) return null;
    CTBlurEffect result = new CTBlurEffect();
    result.setRad(PositiveCoordinateValueConverter.toDocx4j(value.getRad()));
    result.setGrow(BooleanValueConverter.toDocx4j(value.getGrow()));
    return result;
  }
}
