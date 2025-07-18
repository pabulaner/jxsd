package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_CustomColorModel;
import org.docx4j.dml.CTCustomColor;

public class CT_CustomColorConverter {
  private CT_CustomColorConverter() {
  }

  public static CT_CustomColorModel fromDocx4J(CTCustomColor value) {
    if (value == null) return null;
    // look here false;
    CT_CustomColorModel.EG_ColorChoiceModel egColorChoice = new CT_CustomColorModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_CustomColorModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_CustomColorModel(StringConverter.fromDocx4J(value.getName()), egColorChoice);
  }

  public static CTCustomColor toDocx4J(CT_CustomColorModel value) {
    return null;
  }
}
