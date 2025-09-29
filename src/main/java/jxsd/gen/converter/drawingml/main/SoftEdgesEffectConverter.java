package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.SoftEdgesEffectModel;
import org.docx4j.dml.CTSoftEdgesEffect;

/**
 * This is a generated sequence class.
 */
public class SoftEdgesEffectConverter {
  private SoftEdgesEffectConverter() {
  }

  public static SoftEdgesEffectModel fromDocx4j(CTSoftEdgesEffect value) {
    if (value == null) return null;
    return new SoftEdgesEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getRad()));
  }

  public static CTSoftEdgesEffect toDocx4j(SoftEdgesEffectModel value) {
    if (value == null) return null;
    CTSoftEdgesEffect result = new CTSoftEdgesEffect();
    result.setRad(PositiveCoordinateValueConverter.toDocx4j(value.getRad()));
    return result;
  }
}
