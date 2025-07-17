package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetShadowEffectModel;
import org.docx4j.dml.CTPresetShadowEffect;

public class CT_PresetShadowEffectConverter {
  private CT_PresetShadowEffectConverter() {
  }

  public static CT_PresetShadowEffectModel fromDocx4j(CTPresetShadowEffect value) {
    if (value == null) return null;
    return new CT_PresetShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getDist()), ST_PresetShadowValConverter.fromDocx4j(value.getPrst()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getDir()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTPresetShadowEffect toDocx4j(CT_PresetShadowEffectModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_PresetShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTPresetShadowEffect.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTPresetShadowEffect.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_PresetShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
