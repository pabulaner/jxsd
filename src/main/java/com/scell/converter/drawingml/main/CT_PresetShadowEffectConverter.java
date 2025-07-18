package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetShadowEffectModel;
import org.docx4j.dml.CTPresetShadowEffect;

public class CT_PresetShadowEffectConverter {
  private CT_PresetShadowEffectConverter() {
  }

  public static CT_PresetShadowEffectModel fromDocx4J(CTPresetShadowEffect value) {
    if (value == null) return null;
    // look here false;
    CT_PresetShadowEffectModel.EG_ColorChoiceModel egColorChoice = new CT_PresetShadowEffectModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_PresetShadowEffectModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_PresetShadowEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getDist()), ST_PresetShadowValConverter.fromDocx4J(value.getPrst()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getDir()), egColorChoice);
  }

  public static CTPresetShadowEffect toDocx4J(CT_PresetShadowEffectModel value) {
    return null;
  }
}
