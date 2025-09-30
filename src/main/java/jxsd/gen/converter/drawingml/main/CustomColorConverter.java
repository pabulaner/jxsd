package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.CustomColorModel;
import org.docx4j.dml.CTCustomColor;

/**
 * This is a generated sequence class.
 */
public class CustomColorConverter {
  private CustomColorConverter() {
  }

  public static CustomColorModel fromDocx4j(CTCustomColor value) {
    if (value == null) return null;
    CustomColorModel.EG_ColorChoice egColorChoice = new CustomColorModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = CustomColorModel.EG_ColorChoice.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new CustomColorModel(StringValueConverter.fromDocx4j(value.getName()), egColorChoice);
  }

  public static CTCustomColor toDocx4j(CustomColorModel value) {
    if (value == null) return null;
    CTCustomColor result = new CTCustomColor();
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
