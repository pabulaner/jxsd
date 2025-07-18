package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_OuterShadowEffectModel;
import org.docx4j.dml.CTOuterShadowEffect;

public class CT_OuterShadowEffectConverter {
  private CT_OuterShadowEffectConverter() {
  }

  public static CT_OuterShadowEffectModel fromDocx4J(CTOuterShadowEffect value) {
    if (value == null) return null;
    // look here false;
    CT_OuterShadowEffectModel.EG_ColorChoiceModel egColorChoice = new CT_OuterShadowEffectModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_OuterShadowEffectModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_OuterShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getBlurRad()), ST_PositiveCoordinateConverter.fromDocx4J(value.getDist()), BooleanConverter.fromDocx4J(value.getRotWithShape()), ST_PercentageConverter.fromDocx4J(value.getSy()), ST_FixedAngleConverter.fromDocx4J(value.getKy()), ST_PercentageConverter.fromDocx4J(value.getSx()), ST_FixedAngleConverter.fromDocx4J(value.getKx()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getDir()), ST_RectAlignmentConverter.fromDocx4J(value.getAlgn()), egColorChoice);
  }

  public static CTOuterShadowEffect toDocx4J(CT_OuterShadowEffectModel value) {
    return null;
  }
}
