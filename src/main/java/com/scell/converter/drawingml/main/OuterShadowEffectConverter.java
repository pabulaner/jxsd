package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.OuterShadowEffectModel;
import org.docx4j.dml.CTOuterShadowEffect;

public class OuterShadowEffectConverter {
  private OuterShadowEffectConverter() {
  }

  public static OuterShadowEffectModel fromDocx4J(CTOuterShadowEffect value) {
    if (value == null) return null;
    OuterShadowEffectModel.ColorChoiceModel egColorChoice = new OuterShadowEffectModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = OuterShadowEffectModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new OuterShadowEffectModel(PositiveCoordinateValueConverter.fromDocx4J(value.getBlurRad()), PositiveCoordinateValueConverter.fromDocx4J(value.getDist()), BooleanValueConverter.fromDocx4J(value.isRotWithShape()), PercentageValueConverter.fromDocx4J(value.getSy()), FixedAngleValueConverter.fromDocx4J(value.getKy()), PercentageValueConverter.fromDocx4J(value.getSx()), FixedAngleValueConverter.fromDocx4J(value.getKx()), PositiveFixedAngleValueConverter.fromDocx4J(value.getDir()), RectAlignmentValueConverter.fromDocx4J(value.getAlgn()), egColorChoice);
  }
}
