package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetShadowEffectModel;
import org.docx4j.dml.CTPresetShadowEffect;

public class PresetShadowEffectConverter {
  private PresetShadowEffectConverter() {
  }

  public static PresetShadowEffectModel fromDocx4J(CTPresetShadowEffect value) {
    if (value == null) return null;
    PresetShadowEffectModel.ColorChoiceModel egColorChoice = new PresetShadowEffectModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = PresetShadowEffectModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new PresetShadowEffectModel(PositiveCoordinateValueConverter.fromDocx4J(value.getDist()), PresetShadowValValueConverter.fromDocx4J(value.getPrst()), PositiveFixedAngleValueConverter.fromDocx4J(value.getDir()), egColorChoice);
  }
}
