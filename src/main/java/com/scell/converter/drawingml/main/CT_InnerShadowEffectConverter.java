package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_InnerShadowEffectModel;
import org.docx4j.dml.CTInnerShadowEffect;

public class CT_InnerShadowEffectConverter {
  private CT_InnerShadowEffectConverter() {
  }

  public static CT_InnerShadowEffectModel fromDocx4j(CTInnerShadowEffect value) {
    if (value == null) return null;
    return new CT_InnerShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getBlurRad()), ST_PositiveCoordinateConverter.fromDocx4j(value.getDist()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getDir()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTInnerShadowEffect toDocx4j(CT_InnerShadowEffectModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_InnerShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTInnerShadowEffect.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTInnerShadowEffect.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_InnerShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
