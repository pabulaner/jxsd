package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.InnerShadowEffectModel;
import org.docx4j.dml.CTInnerShadowEffect;

public class InnerShadowEffectConverter {
  private InnerShadowEffectConverter() {
  }

  public static InnerShadowEffectModel fromDocx4J(CTInnerShadowEffect value) {
    if (value == null) return null;
    InnerShadowEffectModel.ColorChoiceModel egColorChoice = new InnerShadowEffectModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = InnerShadowEffectModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new InnerShadowEffectModel(PositiveCoordinateConverter.fromDocx4J(value.getBlurRad()), PositiveCoordinateConverter.fromDocx4J(value.getDist()), PositiveFixedAngleConverter.fromDocx4J(value.getDir()), egColorChoice);
  }
}
