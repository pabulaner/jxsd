package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AlphaInverseEffectModel;
import org.docx4j.dml.CTAlphaInverseEffect;

public class AlphaInverseEffectConverter {
  private AlphaInverseEffectConverter() {
  }

  public static AlphaInverseEffectModel fromDocx4J(CTAlphaInverseEffect value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return AlphaInverseEffectModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return AlphaInverseEffectModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return AlphaInverseEffectModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return AlphaInverseEffectModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return AlphaInverseEffectModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return AlphaInverseEffectModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new AlphaInverseEffectModel();
  }
}
