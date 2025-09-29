package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorReplaceEffectModel;
import org.docx4j.dml.CTColorReplaceEffect;

/**
 * This is a generated choice class.
 */
public class ColorReplaceEffectConverter {
  private ColorReplaceEffectConverter() {
  }

  public static ColorReplaceEffectModel fromDocx4j(CTColorReplaceEffect value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return ColorReplaceEffectModel.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return ColorReplaceEffectModel.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) return ColorReplaceEffectModel.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) return ColorReplaceEffectModel.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) return ColorReplaceEffectModel.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) return ColorReplaceEffectModel.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new ColorReplaceEffectModel();
  }

  public static CTColorReplaceEffect toDocx4j(ColorReplaceEffectModel value) {
    if (value == null) return null;
    CTColorReplaceEffect result = new CTColorReplaceEffect();
    if (value.isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getScrgbClr()));
    if (value.isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getSrgbClr()));
    if (value.isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getHslClr()));
    if (value.isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getSysClr()));
    if (value.isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getSchemeClr()));
    if (value.isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getPrstClr()));
    return result;
  }
}
