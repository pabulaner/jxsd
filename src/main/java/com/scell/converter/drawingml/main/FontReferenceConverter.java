package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FontReferenceModel;
import org.docx4j.dml.CTFontReference;

public class FontReferenceConverter {
  private FontReferenceConverter() {
  }

  public static FontReferenceModel fromDocx4J(CTFontReference value) {
    if (value == null) return null;
    FontReferenceModel.ColorChoiceModel egColorChoice = new FontReferenceModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = FontReferenceModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new FontReferenceModel(FontCollectionIndexConverter.fromDocx4J(value.getIdx()), egColorChoice);
  }
}
