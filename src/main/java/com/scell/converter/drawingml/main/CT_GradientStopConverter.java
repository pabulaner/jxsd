package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GradientStopModel;
import org.docx4j.dml.CTGradientStop;

public class CT_GradientStopConverter {
  private CT_GradientStopConverter() {
  }

  public static CT_GradientStopModel fromDocx4J(CTGradientStop value) {
    if (value == null) return null;
    // look here false;
    CT_GradientStopModel.EG_ColorChoiceModel egColorChoice = new CT_GradientStopModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_GradientStopModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_GradientStopModel(ST_PositiveFixedPercentageConverter.fromDocx4J(value.getPos()), egColorChoice);
  }

  public static CTGradientStop toDocx4J(CT_GradientStopModel value) {
    return null;
  }
}
