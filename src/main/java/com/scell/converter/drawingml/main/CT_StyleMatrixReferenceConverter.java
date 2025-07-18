package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_StyleMatrixReferenceModel;
import org.docx4j.dml.CTStyleMatrixReference;

public class CT_StyleMatrixReferenceConverter {
  private CT_StyleMatrixReferenceConverter() {
  }

  public static CT_StyleMatrixReferenceModel fromDocx4J(CTStyleMatrixReference value) {
    if (value == null) return null;
    // look here false;
    CT_StyleMatrixReferenceModel.EG_ColorChoiceModel egColorChoice = new CT_StyleMatrixReferenceModel.EG_ColorChoiceModel();
    if (value.getScrgbClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CT_StyleMatrixReferenceModel.EG_ColorChoiceModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_StyleMatrixReferenceModel(ST_StyleMatrixColumnIndexConverter.fromDocx4J(value.getIdx()), egColorChoice);
  }

  public static CTStyleMatrixReference toDocx4J(CT_StyleMatrixReferenceModel value) {
    return null;
  }
}
