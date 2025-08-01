package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GlowEffectModel;
import org.docx4j.dml.CTGlowEffect;

public class GlowEffectConverter {
  private GlowEffectConverter() {
  }

  public static GlowEffectModel fromDocx4J(CTGlowEffect value) {
    if (value == null) return null;
    GlowEffectModel.ColorChoiceModel egColorChoice = new GlowEffectModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = GlowEffectModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new GlowEffectModel(PositiveCoordinateValueConverter.fromDocx4J(value.getRad()), egColorChoice);
  }
}
