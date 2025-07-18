package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaInverseEffectModel;
import org.docx4j.dml.CTAlphaInverseEffect;

public class CT_AlphaInverseEffectConverter {
  private CT_AlphaInverseEffectConverter() {
  }

  public static CT_AlphaInverseEffectModel fromDocx4J(CTAlphaInverseEffect value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return CT_AlphaInverseEffectModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return CT_AlphaInverseEffectModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return CT_AlphaInverseEffectModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return CT_AlphaInverseEffectModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return CT_AlphaInverseEffectModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return CT_AlphaInverseEffectModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_AlphaInverseEffectModel();
  }

  public static CTAlphaInverseEffect toDocx4J(CT_AlphaInverseEffectModel value) {
    return null;
  }
}
