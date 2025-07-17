package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GlowEffectModel;
import org.docx4j.dml.CTGlowEffect;

public class CT_GlowEffectConverter {
  private CT_GlowEffectConverter() {
  }

  public static CT_GlowEffectModel fromDocx4j(CTGlowEffect value) {
    if (value == null) return null;
    return new CT_GlowEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getRad()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTGlowEffect toDocx4j(CT_GlowEffectModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_GlowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTGlowEffect.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTGlowEffect.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_GlowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
