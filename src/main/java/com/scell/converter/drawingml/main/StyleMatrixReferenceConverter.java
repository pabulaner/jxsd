package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.StyleMatrixReferenceModel;
import org.docx4j.dml.CTStyleMatrixReference;

public class StyleMatrixReferenceConverter {
  private StyleMatrixReferenceConverter() {
  }

  public static StyleMatrixReferenceModel fromDocx4J(CTStyleMatrixReference value) {
    if (value == null) return null;
    StyleMatrixReferenceModel.ColorChoiceModel egColorChoice = new StyleMatrixReferenceModel.ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = StyleMatrixReferenceModel.ColorChoiceModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new StyleMatrixReferenceModel(StyleMatrixColumnIndexValueConverter.fromDocx4J(value.getIdx()), egColorChoice);
  }
}
