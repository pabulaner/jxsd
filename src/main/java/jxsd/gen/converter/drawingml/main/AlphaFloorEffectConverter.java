package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaFloorEffectModel;
import org.docx4j.dml.CTAlphaFloorEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaFloorEffectConverter {
  private AlphaFloorEffectConverter() {
  }

  public static AlphaFloorEffectModel fromDocx4j(CTAlphaFloorEffect value) {
    if (value == null) return null;
    return new AlphaFloorEffectModel();
  }

  public static CTAlphaFloorEffect toDocx4j(AlphaFloorEffectModel value) {
    if (value == null) return null;
    CTAlphaFloorEffect result = new CTAlphaFloorEffect();
    return result;
  }
}
