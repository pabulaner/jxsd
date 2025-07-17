package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_OuterShadowEffectModel;
import org.docx4j.dml.CTOuterShadowEffect;

public class CT_OuterShadowEffectConverter {
  private CT_OuterShadowEffectConverter() {
  }

  public static CT_OuterShadowEffectModel fromDocx4j(CTOuterShadowEffect value) {
    if (value == null) return null;
    return new CT_OuterShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getBlurRad()), ST_PositiveCoordinateConverter.fromDocx4j(value.getDist()), BooleanConverter.fromDocx4j(value.getRotWithShape()), ST_PercentageConverter.fromDocx4j(value.getSy()), ST_FixedAngleConverter.fromDocx4j(value.getKy()), ST_PercentageConverter.fromDocx4j(value.getSx()), ST_FixedAngleConverter.fromDocx4j(value.getKx()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getDir()), ST_RectAlignmentConverter.fromDocx4j(value.getAlgn()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTOuterShadowEffect toDocx4j(CT_OuterShadowEffectModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTOuterShadowEffect.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTOuterShadowEffect.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_OuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
