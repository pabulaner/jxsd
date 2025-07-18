package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_InnerShadowEffectModel;
import org.docx4j.dml.CTInnerShadowEffect;

public class CT_InnerShadowEffectConverter {
  private CT_InnerShadowEffectConverter() {
  }

  public static CT_InnerShadowEffectModel fromDocx4J(CTInnerShadowEffect value) {
    if (value == null) return null;
    // look here false;
    CT_InnerShadowEffectModel.EG_ColorChoiceModel egColorChoice = new CT_InnerShadowEffectModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_InnerShadowEffectModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_InnerShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getBlurRad()), ST_PositiveCoordinateConverter.fromDocx4J(value.getDist()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getDir()), egColorChoice);
  }

  public static CTInnerShadowEffect toDocx4J(CT_InnerShadowEffectModel value) {
    return null;
  }
}
