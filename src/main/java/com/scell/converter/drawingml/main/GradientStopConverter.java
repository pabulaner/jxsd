package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GradientStopModel;
import org.docx4j.dml.CTGradientStop;

public class GradientStopConverter {
  private GradientStopConverter() {
  }

  public static GradientStopModel fromDocx4J(CTGradientStop value) {
    if (value == null) return null;
    GradientStopModel.ColorChoiceModel egColorChoice = new GradientStopModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = GradientStopModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new GradientStopModel(PositiveFixedPercentageConverter.fromDocx4J(value.getPos()), egColorChoice);
  }
}
