package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CustomColorModel;
import org.docx4j.dml.CTCustomColor;

public class CustomColorConverter {
  private CustomColorConverter() {
  }

  public static CustomColorModel fromDocx4J(CTCustomColor value) {
    if (value == null) return null;
    CustomColorModel.ColorChoiceModel egColorChoice = new CustomColorModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CustomColorModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CustomColorModel(StringConverter.fromDocx4J(value.getName()), egColorChoice);
  }
}
