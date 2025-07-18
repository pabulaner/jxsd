package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorModel;
import org.docx4j.dml.CTColor;

public class CT_ColorConverter {
  private CT_ColorConverter() {
  }

  public static CT_ColorModel fromDocx4J(CTColor value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return CT_ColorModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return CT_ColorModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return CT_ColorModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return CT_ColorModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return CT_ColorModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return CT_ColorModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_ColorModel();
  }

  public static CTColor toDocx4J(CT_ColorModel value) {
    return null;
  }
}
