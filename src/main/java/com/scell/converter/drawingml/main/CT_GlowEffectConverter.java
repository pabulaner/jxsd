package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GlowEffectModel;
import org.docx4j.dml.CTGlowEffect;

public class CT_GlowEffectConverter {
  private CT_GlowEffectConverter() {
  }

  public static CT_GlowEffectModel fromDocx4J(CTGlowEffect value) {
    if (value == null) return null;
    // look here false;
    CT_GlowEffectModel.EG_ColorChoiceModel egColorChoice = new CT_GlowEffectModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_GlowEffectModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_GlowEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getRad()), egColorChoice);
  }

  public static CTGlowEffect toDocx4J(CT_GlowEffectModel value) {
    return null;
  }
}
