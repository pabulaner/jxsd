package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorModel;
import org.docx4j.dml.CTColor;

/**
 * This is a generated choice class.
 */
public class ColorConverter {
  private ColorConverter() {
  }

  public static ColorModel fromDocx4j(CTColor value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return ColorModel.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return ColorModel.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) return ColorModel.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) return ColorModel.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) return ColorModel.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) return ColorModel.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new ColorModel();
  }

  public static CTColor toDocx4j(ColorModel value) {
    if (value == null) return null;
    CTColor result = new CTColor();
    if (value.isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getScrgbClr()));
    if (value.isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getSrgbClr()));
    if (value.isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getHslClr()));
    if (value.isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getSysClr()));
    if (value.isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getSchemeClr()));
    if (value.isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getPrstClr()));
    return result;
  }
}
