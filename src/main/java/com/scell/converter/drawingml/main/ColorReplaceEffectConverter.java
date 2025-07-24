package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorReplaceEffectModel;
import org.docx4j.dml.CTColorReplaceEffect;

public class ColorReplaceEffectConverter {
  private ColorReplaceEffectConverter() {
  }

  public static ColorReplaceEffectModel fromDocx4J(CTColorReplaceEffect value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return ColorReplaceEffectModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return ColorReplaceEffectModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return ColorReplaceEffectModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return ColorReplaceEffectModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return ColorReplaceEffectModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return ColorReplaceEffectModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new ColorReplaceEffectModel();
  }
}
