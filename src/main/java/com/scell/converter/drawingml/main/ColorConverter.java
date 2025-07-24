package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorModel;
import org.docx4j.dml.CTColor;

public class ColorConverter {
  private ColorConverter() {
  }

  public static ColorModel fromDocx4J(CTColor value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return ColorModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return ColorModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return ColorModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return ColorModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return ColorModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return ColorModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new ColorModel();
  }
}
